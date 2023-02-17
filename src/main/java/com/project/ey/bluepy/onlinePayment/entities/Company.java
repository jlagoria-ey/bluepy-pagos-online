package com.project.ey.bluepy.onlinePayment.entities;

import java.io.Serializable;

public class Company extends UuidIdentifiedEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private String lastName;

    private Long companyNumber;

    private Boolean activa;
}
