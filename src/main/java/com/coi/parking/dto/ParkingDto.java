package com.coi.parking.dto;

import java.util.Date;

public class ParkingDto {
    private Integer placeNumber;

    private String carNumber;

    private String ownerFIO;

    private String ownerPhoneNumber;

    private Date endTime;

    private Integer price;

    public Integer getPlaceNumber() {
        return placeNumber;
    }

    public void setPlaceNumber(Integer placeNumber) {
        this.placeNumber = placeNumber;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
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

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
