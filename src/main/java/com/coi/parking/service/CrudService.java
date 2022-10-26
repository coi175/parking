package com.coi.parking.service;

import com.coi.parking.dto.ParkingDto;

import java.util.List;

public interface CrudService {
    List<ParkingDto> findAll();

    ParkingDto find(Integer placeNumber);

    void insert(ParkingDto parkingDto);
    void update(ParkingDto parkingDto);

    void delete(Integer placeNumber);


}
