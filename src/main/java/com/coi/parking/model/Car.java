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

    public Integer getCarId() {
        return carId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOwnerFIO() {
        return ownerFIO;
    }

    public void setOwnerFIO(String ownerFIO) {
        this.ownerFIO = ownerFIO;
    }

    public String getOwnerPhoneNumber() {
        return ownerPhoneNumber;
    }

    public void setOwnerPhoneNumber(String ownerPhoneNumber) {
        this.ownerPhoneNumber = ownerPhoneNumber;
    }
}
