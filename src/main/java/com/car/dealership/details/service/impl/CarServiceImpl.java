package com.car.dealership.details.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.car.dealership.details.model.Car;
import com.car.dealership.details.repository.CarRepository;
import com.car.dealership.details.request.CarRequest;
import com.car.dealership.details.response.CarResponse;
import com.car.dealership.details.service.CarService;

public class CarServiceImpl implements CarService {
	@Autowired
	CarRepository repository;

	@Override
	public CarResponse addCar(CarRequest carRequest) {
		CarResponse carResponse = new CarResponse();
		Car car = new Car();
		BeanUtils.copyProperties(carRequest, car);
		car.setId(getCountofCars() + 1);
		repository.save(car);
		carResponse.setMessage("Succes Car is added");
		carResponse.setId(car.getId());
		return carResponse;
	}

	// ---------------------------------------UTILITY METHODS------------------------------------------------------//

	private int getCountofCars() {
		return repository.getTotalCars();

	}
}
