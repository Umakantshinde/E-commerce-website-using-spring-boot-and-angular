package com.company.ecom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.ecom.dao.RoleDao;
import com.company.ecom.entity.Role;

@Service
public class RoleService {
	@Autowired
	private RoleDao roleDao;
	public Role createNewRole(Role role) {
         return roleDao.save(role);
	}

}
