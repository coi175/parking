package com.coi.parking.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class BookingDetail {
    @Id
    @GeneratedValue
    @Column(name="booking_detail_id")
    private Integer bookingDetailId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="end_time")
    private Date endTime;

    @Column(name="price")
    private Integer price;

    public Integer getBookingDetailId() {
        return bookingDetailId;
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
