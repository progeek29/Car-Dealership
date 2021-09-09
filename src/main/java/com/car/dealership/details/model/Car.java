package com.car.dealership.details.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Garage")
@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Car {
	@Id
	@Column(name = "id")
	private long id;
	@Column(name = "name")
	private String name;

	@Column(name = "brand")
	private String brand;
	@Column(name = "model")
	private String model;
	@Column(name = "engine")
	private String engine;
	@Column(name = "color")
	private String color;
	@Column(name = "manufacture_date")
	private String manufactureDate;
	@Column(name = "year")
	private int year;
	@Column(name = "new_status")
	private boolean newStatus;

}
