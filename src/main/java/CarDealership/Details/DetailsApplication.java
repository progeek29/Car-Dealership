package CarDealership.Details;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import CarDealership.Details.controller.Car;
import CarDealership.Details.repository.CarRepository;


@SpringBootApplication
public class DetailsApplication  {
//	implements CommandLineRunner {
	@Autowired
	CarRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(DetailsApplication.class, args);
	}	
//		@Override
//		public void run(String[] args)
//		{
//			Car spec = repository.findById("1").get();		
//			System.out.println(spec.getName());
//			System.out.println(spec.getBrand());
//			
//			Car en = new Car();
//			
//			en.setName("Agera");
//			en.setId(3);
//			en.setBrand("Koenigsegg ");
//			en.setModel("Final");
//			en.setEngine("5000 cc");
//			en.setColor("Black Hematite");
//			en.setManufacture_date("12-09");
//			en.setYear(2016);
//			en.setNew_status(true);
//			repository.save(en);
			// update in sql table
//			List<Car> allrecords =repository.findAll();
			
//			for(Car item : allrecords)
//			{
//				System.out.println(item.getBrand());
//  			}
//			repository.delete(en);
			//delete from sql table
//			}						
}
