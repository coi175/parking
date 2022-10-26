package com.coi.parking.service;

import com.coi.parking.dto.ParkingDto;
import com.coi.parking.model.ParkingPlace;

import java.util.List;
import java.util.Optional;

public interface CrudService {
    List<ParkingDto> findAll();

    ParkingDto find(Integer placeNumber);

    void save(ParkingDto parkingDto);

    void delete(Integer placeNumber);


}
