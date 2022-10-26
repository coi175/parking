package com.coi.parking.service;

import com.coi.parking.dto.ParkingDto;
import com.coi.parking.model.BookingDetail;
import com.coi.parking.model.Car;
import com.coi.parking.model.ParkingPlace;
import org.springframework.stereotype.Service;

@Service
public class DtoMappingService {
    public ParkingDto mapToParkingDto(ParkingPlace parkingPlace) {
        Car car = parkingPlace.getCar();
        BookingDetail bookingDetail = parkingPlace.getBookingDetail();

        ParkingDto parkingDto = new ParkingDto();
        parkingDto.setPlaceNumber(parkingPlace.getPlaceNumber());

        parkingDto.setCarNumber(car.getNumber());
        parkingDto.setOwnerFIO(car.getOwnerFIO());
        parkingDto.setOwnerPhoneNumber(car.getOwnerPhoneNumber());

        parkingDto.setEndTime(bookingDetail.getEndTime());
        parkingDto.setPrice(bookingDetail.getPrice());

        return parkingDto;
    }

    public void mapToEntities(ParkingDto parkingDto, ParkingPlace parkingPlace) {
        parkingPlace.setPlaceNumber(parkingDto.getPlaceNumber());
        Car car = new Car();
        BookingDetail bookingDetail = new BookingDetail();

        car.setNumber(parkingDto.getCarNumber());
        car.setOwnerFIO(parkingDto.getOwnerFIO());
        car.setOwnerPhoneNumber(parkingDto.getOwnerPhoneNumber());

        bookingDetail.setEndTime(parkingDto.getEndTime());
        bookingDetail.setPrice(parkingDto.getPrice());

        parkingPlace.setCar(car);
        parkingPlace.setBookingDetail(bookingDetail);
    }
}
