package com.car.dealership.details.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.car.dealership.details.request.CarRequest;
import com.car.dealership.details.response.CarResponse;
import com.car.dealership.details.service.CarService;

@RestController
public class CarController {

	@Autowired
	CarService carService;

	@PostMapping("/addCar")
	public ResponseEntity<CarResponse> addCarImplementation(@RequestBody CarRequest carRequest) {

		return new ResponseEntity<>(carService.addCar(carRequest), HttpStatus.CREATED);
	}
}
