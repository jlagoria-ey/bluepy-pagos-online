package com.project.ey.bluepy.onlinePayment.services;

import com.project.ey.bluepy.onlinePayment.entities.OnlinePayment;

import java.rmi.ServerException;

public interface OnlinePaymentService {
    OnlinePayment doPayment(OnlinePayment payment) throws ServerException;
    OnlinePayment update(OnlinePayment payment);
}
