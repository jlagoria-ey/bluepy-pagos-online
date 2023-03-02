package com.project.ey.bluepy.onlinePayment.controller;

import com.project.ey.bluepy.onlinePayment.entities.OnlinePayment;
import com.project.ey.bluepy.onlinePayment.entities.User;
import com.project.ey.bluepy.onlinePayment.services.OnlinePaymentService;
import com.project.ey.bluepy.onlinePayment.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.rmi.ServerException;
import java.util.List;

@RestController
public class OnlinePaymentController {

    @Autowired
    OnlinePaymentService onlinePaymentService;

    @PostMapping(path = "onlinePayment",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OnlinePayment> saveOnlinePayment(@RequestBody OnlinePayment onlinePayment) throws ServerException {

        OnlinePayment onlinePaymentSaved = onlinePaymentService.doPayment(onlinePayment);

        if (onlinePaymentSaved == null) {
            throw new ServerException("Error de datos");
        } else {
            return new ResponseEntity<>(onlinePaymentSaved, HttpStatus.CREATED);
        }
    }

}
