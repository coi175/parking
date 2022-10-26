package com.coi.parking.controller;

import com.coi.parking.dto.ParkingDto;
import com.coi.parking.service.CrudService;
import com.coi.parking.service.ParkingCrudService;
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
        return ResponseEntity.ok().body(null);
    }

    @GetMapping("/parking/{id}")
    public ResponseEntity<ParkingDto> getParkingPlaceInfo(@PathVariable Integer id) {
        return ResponseEntity.ok().body(null);
    }

    @PostMapping("/parking")
    public ResponseEntity<?> createParkingPlace(@RequestBody ParkingDto parkingDto) {
        return ResponseEntity.ok().body(null);
    }

    @PutMapping("/parking/{id}")
    public ResponseEntity<?> updateParkingPlace(@RequestBody ParkingDto parkingDto) {
        return ResponseEntity.ok().body(null);
    }

    @DeleteMapping("/parking/{delete}")
    public ResponseEntity<?> deleteParkingPlace(@PathVariable Integer id) {
        return ResponseEntity.ok().build();
    }
}
