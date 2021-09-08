package CarDealership.Details.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name="Garage")
	public class Car {
	    @Column(name="name")
		private String name;
	    @Id
	    @Column(name="id")
		private long id;
	    @Column(name="brand")
		private String brand;
	    @Column(name="model")
		private String model;
	    @Column(name="engine")
		private String engine;
	    @Column(name="color")
		private String color;
	    @Column(name="manufacture_date")
		private String manufacture_date;
	    @Column(name="year")
		private int year;
	    @Column(name="new_status")
		private boolean new_status;
	    
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public String getEngine() {
			return engine;
		}
		public void setEngine(String engine) {
			this.engine = engine;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getManufacture_date() {
			return manufacture_date;
		}
		public void setManufacture_date(String manufacture_date) {
			this.manufacture_date = manufacture_date;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public boolean isNew_status() {
			return new_status;
		}
		public void setNew_status(boolean new_status) {
			this.new_status = new_status;
		}
}
