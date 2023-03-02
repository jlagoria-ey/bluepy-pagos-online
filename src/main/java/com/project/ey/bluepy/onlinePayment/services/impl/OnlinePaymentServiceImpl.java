package com.project.ey.bluepy.onlinePayment.services.impl;

import com.project.ey.bluepy.onlinePayment.entities.Account;
import com.project.ey.bluepy.onlinePayment.entities.OnlinePayment;
import com.project.ey.bluepy.onlinePayment.repositories.OnlinePaymentRepository;
import com.project.ey.bluepy.onlinePayment.services.AccountService;
import com.project.ey.bluepy.onlinePayment.services.OnlinePaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.rmi.ServerException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class OnlinePaymentServiceImpl implements OnlinePaymentService {

    @Autowired
    OnlinePaymentRepository onlinePaymentRepository;

    @Autowired
    AccountService accountService;
    @Override
    public OnlinePayment doPayment(OnlinePayment payment) throws ServerException {
        Account accountSender = accountService.findAccountByNumber(payment.getSenderAccountNumber());
        Account accountReceiver = accountService.findAccountByNumber(payment.getReceiverAccountNumber());

        Boolean isSenderEnoughFunds = payment.getAmount() <= accountSender.getAccount_amount();
        Boolean isReceiverActive = accountReceiver.getActive();

        if (!isReceiverActive){
            throw new ServerException("La cuenta a pagar no se encuentra activa");
        }

        if (!isSenderEnoughFunds){
            throw new ServerException("No hay suficiente dinero para realizar el pago");
        }

        if(isReceiverActive && isSenderEnoughFunds){
            accountSender.setAccount_amount(accountSender.getAccount_amount() - payment.getAmount());
            accountReceiver.setAccount_amount(accountReceiver.getAccount_amount() + payment.getAmount());

            accountService.save(accountSender);
            accountService.save(accountReceiver);

            payment.setTransferDate(new Date());
            OnlinePayment paymentSaved = onlinePaymentRepository.save(payment);

            return paymentSaved;
        }
        return new OnlinePayment();
    }

    @Override
    public OnlinePayment update(OnlinePayment payment) {
        return onlinePaymentRepository.save(payment);
    }
}
