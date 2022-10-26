package com.coi.parking.service;

import com.coi.parking.dto.ParkingDto;
import com.coi.parking.repository.ParkingPlaceRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ParkingCrudService implements CrudService {
    final ParkingPlaceRepository parkingPlaceRepository;

    public ParkingCrudService(ParkingPlaceRepository parkingPlaceRepository) {
        this.parkingPlaceRepository = parkingPlaceRepository;
    }

    @Override
    public List<ParkingDto> findAll() {
        return null;
    }

    @Override
    public ParkingDto find(Integer placeNumber) {
        return null;
    }

    @Override
    public void insert(ParkingDto parkingDto) {

    }

    @Override
    public void update(ParkingDto parkingDto) {

    }

    @Override
    public void delete(Integer placeNumber) {

    }
}
