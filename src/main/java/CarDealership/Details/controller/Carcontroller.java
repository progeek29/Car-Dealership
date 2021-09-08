package CarDealership.Details.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import CarDealership.Details.repository.CarRepository;

@RestController
public class Carcontroller {
//	@Autowired
//	Car car;
//	AtomicLong counter = new AtomicLong();
	
	@Autowired
	CarRepository repository;
	
//	@GetMapping("/findcars")
//	public Car car(@RequestParam(value="name")String name)
//	{
//		car.setId(counter.incrementAndGet());
//		car.setName("The fastest car in the world"+name);
//		return car;
//	}
	@PostMapping("/addCar")
	public ResponseEntity addCarImplementation(@RequestBody Car car)
	{
		AddResponse ad = new AddResponse();
		car.setId(4);
		repository.save(car);
		ad.setMessage("Succes Car is added");
		ad.setId(4);
//		return ad;
		return new ResponseEntity<AddResponse>(ad,HttpStatus.CREATED);
	}
}
