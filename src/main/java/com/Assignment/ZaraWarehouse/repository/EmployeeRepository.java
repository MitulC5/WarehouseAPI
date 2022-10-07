package com.Assignment.ZaraWarehouse.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Assignment.ZaraWarehouse.model.EmployeeModel;

@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeModel,String>{

}
