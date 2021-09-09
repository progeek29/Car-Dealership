package com.car.dealership.details.service;

import com.car.dealership.details.request.CarRequest;
import com.car.dealership.details.response.CarResponse;

public interface CarService {

	CarResponse addCar(CarRequest carRequest);

}
