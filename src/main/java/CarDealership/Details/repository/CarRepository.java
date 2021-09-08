package CarDealership.Details.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import CarDealership.Details.controller.Car;

public interface CarRepository extends JpaRepository<Car, String> {

}
