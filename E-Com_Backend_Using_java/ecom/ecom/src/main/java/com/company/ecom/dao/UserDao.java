package com.company.ecom.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.company.ecom.entity.User;

@Repository
public interface UserDao extends  CrudRepository<User ,String> {

}
