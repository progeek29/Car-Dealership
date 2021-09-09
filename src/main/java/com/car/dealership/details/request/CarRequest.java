package com.car.dealership.details.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor

public class CarRequest {
	@JsonProperty("name")
	private String name;
	@JsonProperty("brand")
	private String brand;
	@JsonProperty("model")
	private String model;
	@JsonProperty("engine")
	private String engine;
	@JsonProperty("color")
	private String color;
	@JsonProperty("manufacture_date")
	private String manufactureDate;
	@JsonProperty("year")
	private int year;
	@JsonProperty("new_status")
	private boolean newStatus;

}
