package com.project.ey.bluepy.onlinePayment.entities;

import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@Document("pagos-online")
public class OnlinePayment extends UuidIdentifiedEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long senderAccountNumber;
    private Long ReceiverAccountNumber;
    private Float amount;
    private Date transferDate;

    public OnlinePayment() {
    }

    public Long getSenderAccountNumber() {
        return senderAccountNumber;
    }

    public void setSenderAccountNumber(Long senderAccountNumber) {
        this.senderAccountNumber = senderAccountNumber;
    }

    public Long getReceiverAccountNumber() {
        return ReceiverAccountNumber;
    }

    public void setReceiverAccountNumber(Long receiverAccountNumber) {
        ReceiverAccountNumber = receiverAccountNumber;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Date getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(Date transferDate) {
        this.transferDate = transferDate;
    }
}
