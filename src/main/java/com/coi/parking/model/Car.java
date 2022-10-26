package com.coi.parking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Car {
    @Id
    @GeneratedValue
    @Column(name="car_id")
    private Integer carId;

    @Column(name="number")
    private String number;

    @Column(name="owner_fio")
    private String ownerFIO;

    @Column(name="owner_phone_number")
    private String ownerPhoneNumber;
}
