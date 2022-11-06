package com.company.ecom.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.company.ecom.dao.RoleDao;
import com.company.ecom.dao.UserDao;
import com.company.ecom.entity.Role;
import com.company.ecom.entity.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	@Autowired
	private RoleDao roleDao;
	public User registerNewUser(User user) {
		 Role role = roleDao.findById("User").get();
	        Set<Role> userRoles = new HashSet<>();
	        userRoles.add(role);
	        user.setRole(userRoles);
	        user.setUserPassword(getEncodedPassword(user.getUserPassword()));
	        return userDao.save(user);
	}
	@Autowired
    private PasswordEncoder passwordEncoder;
	public void  initRolesAndUser() {
		
		Role adminRole=new Role();
		adminRole.setRolename("Admin");
		adminRole.setRoleDescription("Admin role");
		roleDao.save(adminRole);
		

		Role userRole=new Role();
		userRole.setRolename("user");
		userRole.setRoleDescription(" defalut user role newly created recored");
		roleDao.save(userRole);
		
		User adminUser=new User();
		adminUser.setUserFirstName("Admin");
		adminUser.setUserLastName("admin");
		adminUser.setUserName("admin");
		adminUser.setUserPassword(getEncodedPassword("admin"));
		
		Set<Role> adminRoles= new HashSet<>();
		adminRoles.add(adminRole);
		adminUser.setRole(adminRoles);
		
		userDao.save(adminUser);
		
		
		
		User user=new User();
		user.setUserFirstName("Umakant_T");
		user.setUserLastName("Shinde");
		user.setUserName("UTS.life");
		user.setUserPassword(getEncodedPassword("UTS@pass"));
		
		Set<Role> userRoles= new HashSet<>();
		userRoles.add(userRole);
		user.setRole(userRoles);
		 
		userDao.save(user);
	}
	 public String getEncodedPassword(String password) {
	        return passwordEncoder.encode(password);
	    }
} 

