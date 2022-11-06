package com.company.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.company.ecom.entity.Role;
import com.company.ecom.service.RoleService;

@RestController
public class RoleController {
	@Autowired
 private RoleService roleService;
	@PostMapping({"/createNewRole"})
	public Role createNewRole( @RequestBody  Role role) {
		return roleService.createNewRole(role);
	
		
	}
}
