package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.RCRegistration;
import com.example.demo.service.RCRegistrationService;

@RestController
@RequestMapping("/RCRegistration")
public class RCRegistrationController {
	@Autowired
	RCRegistrationService rCRegistrationService;
	@GetMapping("/")
	public List<RCRegistration> getRCRegistration(){
		return null;
		
		
	}
}
