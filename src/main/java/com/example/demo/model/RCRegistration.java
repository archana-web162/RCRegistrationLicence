package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class RCRegistration {
	@Id
	@GeneratedValue
	private Long id;
	private int rCno;
	private Date registeredDate;
	private String ownerName;
	private String city;
	private String hypothecatedcto;
	private String color;

	public RCRegistration(int rCno, Date registeredDate, String ownerName, String city, String hypothecatedcto,
			String color) {
		super();
		this.rCno = rCno;
		this.registeredDate = registeredDate;
		this.ownerName = ownerName;
		this.city = city;
		this.hypothecatedcto = hypothecatedcto;
		this.color = color;
	}

	@OneToOne
	private VehicleType vehicleType;

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	public RCRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getrCno() {
		return rCno;
	}

	public void setrCno(int rCno) {
		this.rCno = rCno;
	}

	public Date getRegisteredDate() {
		return registeredDate;
	}

	public void setRegisteredDate(Date registeredDate) {
		this.registeredDate = registeredDate;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getHypothecatedcto() {
		return hypothecatedcto;
	}

	public void setHypothecatedcto(String hypothecatedcto) {
		this.hypothecatedcto = hypothecatedcto;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
