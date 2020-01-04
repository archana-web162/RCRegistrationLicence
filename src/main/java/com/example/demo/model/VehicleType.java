package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class VehicleType {
	@Id
	@GeneratedValue
	private Long id;
	private String type;
	private String brand;
	private String model;
	public VehicleType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VehicleType(Long id, String type, String brand, String model) {
		super();
		this.id = id;
		this.type = type;
		this.brand = brand;
		this.model = model;
	}
	
	public VehicleType(String type, String brand, String model) {
		super();
		this.type = type;
		this.brand = brand;
		this.model = model;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
	
	
}
