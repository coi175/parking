package com.coi.parking.controller;

import com.coi.parking.dto.ParkingDto;
import com.coi.parking.service.CrudService;
import com.coi.parking.service.ParkingCrudService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ParkingRestController {
    final CrudService crudService;

    public ParkingRestController(ParkingCrudService parkingCrudService) {
        this.crudService = parkingCrudService;
    }

    @GetMapping("/parkings")
    public ResponseEntity<?> getParkingList() {
        List<ParkingDto> result = crudService.findAll();
        return ResponseEntity.ok().body(result);
    }

    @GetMapping("/parking/{id}")
    public ResponseEntity<ParkingDto> getParkingPlaceInfo(@PathVariable Integer id) {
        ParkingDto parkingDto = crudService.find(id);
        if (parkingDto == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.ok().body(parkingDto);
    }

    @PostMapping("/parking")
    public ResponseEntity<?> createParkingPlace(@RequestBody ParkingDto parkingDto) {
        ParkingDto temp = crudService.find(parkingDto.getPlaceNumber());
        if (temp != null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("This parking CHANGED HERE number already exist in database");
        }
        System.out.println("I ZDES");
        crudService.save(parkingDto);
        return ResponseEntity.ok().body(parkingDto.getPlaceNumber());
    }

    @PutMapping("/parking/{id}")
    public ResponseEntity<?> updateParkingPlace(@RequestBody ParkingDto parkingDto) {
        ParkingDto _parkingDto = crudService.find(parkingDto.getPlaceNumber());
        if (_parkingDto == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not exist in database");
        }

        _parkingDto.setPlaceNumber(parkingDto.getPlaceNumber());
        _parkingDto.setCarNumber(parkingDto.getCarNumber());
        _parkingDto.setOwnerFIO(parkingDto.getOwnerFIO());
        _parkingDto.setOwnerPhoneNumber(parkingDto.getOwnerPhoneNumber());
        _parkingDto.setEndTime(parkingDto.getEndTime());
        _parkingDto.setPrice(parkingDto.getPrice());

        crudService.save(_parkingDto);
        return ResponseEntity.ok().body(_parkingDto.getPlaceNumber());
    }

    @DeleteMapping("/parking/{id}")
    public ResponseEntity<?> deleteParkingPlace(@PathVariable Integer id) {
        ParkingDto parkingDto = crudService.find(id);
        if (parkingDto == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Impossible to delete entity because it doesn't exist");
        }
        crudService.delete(id);
        return ResponseEntity.ok().body(id);
    }
}
