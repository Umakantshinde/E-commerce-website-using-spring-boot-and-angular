package com.company.ecom.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.company.ecom.entity.Role;
@Repository
public interface RoleDao  extends CrudRepository<Role,String>{

}
