package com.car.dealership.details.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.car.dealership.details.model.Car;
import com.car.dealership.details.utils.CDConstants;

public interface CarRepository extends JpaRepository<Car, Long> {

	@Query(CDConstants.CAR_COUNT_QUERY)
	int getTotalCars();
}
