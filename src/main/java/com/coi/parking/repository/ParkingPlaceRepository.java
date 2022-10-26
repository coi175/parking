package com.coi.parking.repository;

import com.coi.parking.model.ParkingPlace;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingPlaceRepository extends JpaRepository<Integer, ParkingPlace> {

}
