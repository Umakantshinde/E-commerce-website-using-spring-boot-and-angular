package com.company.ecom.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.company.ecom.entity.JwtRequest;
import com.company.ecom.service.JwtService;

@RestController
@CrossOrigin
public class JwtController {
	private JwtService jwtService;
	
	@PostMapping({"/authenticate"})
	public void createJwtToken(@RequestBody JwtRequest jwtRequest) {
		
	}

}
