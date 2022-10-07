package com.Assignment.ZaraWarehouse.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Assignment.ZaraWarehouse.model.EmployeeModel;
import com.Assignment.ZaraWarehouse.model.ItemModel;
import com.Assignment.ZaraWarehouse.services.EmployeeService;
import com.Assignment.ZaraWarehouse.services.ItemService;

import lombok.extern.java.Log;

@RestController
@Log
@RequestMapping("/warehouse")
public class WarehouseController {
	
	@Autowired
	ItemService itemservice;
	@Autowired
	EmployeeService empservice;
	
	@GetMapping("/items")
	public List getAllItems() {	
		return itemservice.getAllItems();
	}
	@GetMapping("/item/{itemid}")
	public ItemModel getItem(@PathVariable String itemid) {
		return itemservice.getItem(itemid);
	}
	
	@PutMapping("/item/{itemid}")
	public void updateItem(@PathVariable String itemid, @RequestBody ItemModel item) {
		log.info("Item updated successfully!");
		itemservice.updateItem(itemid,item);
		
	}
	
	@PostMapping("/additem")
	public void addItem(@RequestBody ItemModel item) {
		log.info("Item Added successfully!");
		itemservice.addItems(item);
	}
	
	
	@DeleteMapping("/delitem/{itemid}")
	public String deleteUser(@PathVariable String itemid) {
		
		itemservice.deleteItem(itemid);
		log.info("Item deleted successfully!");
		return "Item has been deleted successfully!";
	}
	
	//EmployeeService
	@GetMapping("/employees")
	public List getAllEmployees(){
		return empservice.getAllEmployees();
	}
	@GetMapping("/employee/{empid}")
	public EmployeeModel getEmployee(@PathVariable String empid) {
		log.info(empid);
		return empservice.getEmployee(empid);
	}
	@PutMapping("/employee/{empid}")
	public void updateEmployee(@PathVariable String empid,@RequestBody EmployeeModel emp) {
		log.info("Item updated successfully!");
		empservice.updateEmployee(empid,emp);
	}
	@PostMapping("/addemployee")
	public void addEmployee(@RequestBody EmployeeModel emp) {
		log.info("Employee Added!");
		empservice.addEmployee(emp);
	}
	@DeleteMapping("delemployee/{empid}")
	public String deleteEmployee(@PathVariable String empid) {
		 empservice.deleteEmployee(empid);
		 log.info("Employee Deleted!");
		 return "Employee delete Sucessfully!";
	}
	
}
