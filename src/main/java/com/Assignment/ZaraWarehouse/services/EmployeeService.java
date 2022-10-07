package com.Assignment.ZaraWarehouse.services;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Assignment.ZaraWarehouse.repository.EmployeeRepository;

import lombok.extern.java.Log;

import com.Assignment.ZaraWarehouse.model.EmployeeModel;

@Log
@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository empRepository;
	
	public List getAllEmployees() {
		List<EmployeeModel> employees=new ArrayList<EmployeeModel>();
		employees = (List<EmployeeModel>)empRepository.findAll();
		return employees;
	}
	
	public EmployeeModel getEmployee(String id)
	{
		Optional<EmployeeModel> employee=empRepository.findById(id);
		return employee.orElseGet(null);
	}
	
	public void addEmployee(EmployeeModel emp) {
		empRepository.save(emp);
	}
	
	public EmployeeModel updateEmployee(String id,EmployeeModel emp)
	{
		if(empRepository.findById(id).isPresent()) {
			EmployeeModel e = empRepository.findById(id).get();
			e.setEmpfname(emp.getEmpfname());
			e.setEmplname(emp.getEmplname());
			e.setEmpage(emp.getEmpage());
			e.setEmpphone(emp.getEmpphone());
			e.setEmpaddr(emp.getEmpaddr());
			return empRepository.save(e);
			
		}else {
			log.severe("Update Failed!");
			return null;
		}
		
		
		
//		if(getEmployee(id)!=null)
//		{
//			return (EmployeeModel) empRepository.save(emp);
//			
//		}else
//		{
//			return null;
//		}
	}
	
	public void deleteEmployee(String id) {
		empRepository.deleteById(id);
	}
}
