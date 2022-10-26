package com.coi.parking.service;

import com.coi.parking.dto.ParkingDto;
import com.coi.parking.model.BookingDetail;
import com.coi.parking.model.Car;
import com.coi.parking.model.ParkingPlace;
import com.coi.parking.repository.ParkingPlaceRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class ParkingCrudService implements CrudService {
    final ParkingPlaceRepository parkingPlaceRepository;
    final DtoMappingService dtoMappingService;

    public ParkingCrudService(ParkingPlaceRepository parkingPlaceRepository, DtoMappingService dtoMappingService) {
        this.parkingPlaceRepository = parkingPlaceRepository;
        this.dtoMappingService = dtoMappingService;
    }

    @Override
    public List<ParkingDto> findAll() {
        return parkingPlaceRepository
                .findAll()
                .stream()
                .map(dtoMappingService::mapToParkingDto)
                .collect(Collectors.toList());
    }

    @Override
    public ParkingDto find(Integer placeNumber) {
        Optional<ParkingPlace> parkingPlace = parkingPlaceRepository.findById(placeNumber);
        return parkingPlace.map(dtoMappingService::mapToParkingDto).orElse(null);
    }

    @Override
    public void save(ParkingDto parkingDto) {
        ParkingPlace parkingPlace = new ParkingPlace();
        Car car = new Car();
        BookingDetail bookingDetail = new BookingDetail();

        dtoMappingService.mapToEntities(parkingDto, parkingPlace, car, bookingDetail);
        parkingPlace.setCar(car);
        parkingPlace.setBookingDetail(bookingDetail);

        parkingPlaceRepository.saveAndFlush(parkingPlace);
    }

    @Override
    public void delete(Integer placeNumber) {
        parkingPlaceRepository.deleteById(placeNumber);
    }
}
