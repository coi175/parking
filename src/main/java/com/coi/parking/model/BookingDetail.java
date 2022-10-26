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
}
