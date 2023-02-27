package com.project.ey.bluepy.onlinePayment.entities;

import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document("cuenta")
public class Account extends UuidIdentifiedEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private String user_id;
    private Float account_amount;
    private Long accountNumber;
    private Boolean active;

    public Account() {
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Float getAccount_amount() {
        return account_amount;
    }

    public void setAccount_amount(Float account_amount) {
        this.account_amount = account_amount;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
