package com.coi.parking.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class BookingDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="booking_detail_id")
    private Integer bookingDetailId;

    @Column(name="end_time")
    private LocalDateTime endTime;

    @Column(name="price")
    private Integer price;

    public Integer getBookingDetailId() {
        return bookingDetailId;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
