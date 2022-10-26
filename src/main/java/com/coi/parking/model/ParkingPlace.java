package com.coi.parking.model;

import org.hibernate.annotations.OnDelete;

import javax.persistence.*;

@Entity
public class ParkingPlace {
    @Id
    @Column(name="place_number")
    private Integer placeNumber;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name="booking_detail_id")
    private BookingDetail bookingDetail;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name="car_id")
    private Car car;
}
