package com.example.demo;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.RCRegistration;
import com.example.demo.model.VehicleType;
import com.example.demo.repository.RCRegistrationRepository;
import com.example.demo.repository.VehicleRepository;

@SpringBootApplication
public class RcRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RcRegistrationApplication.class, args);
	}

	@Autowired
	VehicleRepository vehicleRepository;
	@Autowired
	RCRegistrationRepository rCRegistrationRepository;

	@PostConstruct
	public void createData() {
		VehicleType Audi = new VehicleType("LMV", "Audi", "Q5");
		VehicleType BMW = new VehicleType("LMV", "BMW", "X5");
		VehicleType Maruti = new VehicleType("LMV", "Maruti", "WagonR");
		vehicleRepository.save(Maruti);
		vehicleRepository.save(BMW);
		vehicleRepository.save(Audi);

		RCRegistration r1 = new RCRegistration(1111, new Date(), "Archana", "Pune", "adddf", "Blue");
		r1.setVehicleType(Maruti);
		rCRegistrationRepository.save(r1);
		RCRegistration r2 = new RCRegistration(1111, new Date(), "Archana", "Pune", "adddf", "Blue");

		r2.setVehicleType(BMW);
		rCRegistrationRepository.save(r2);
		RCRegistration r3 = new RCRegistration(1111, new Date(), "Archana", "Pune", "adddf", "Blue");
		r3.setVehicleType(Audi);
		rCRegistrationRepository.save(r3);
	}

}
