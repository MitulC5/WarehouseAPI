package com.Assignment.ZaraWarehouse.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Table(name="employee")
@Data
public class EmployeeModel {
	
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	private String empid;
	private String empfname;
	private String emplname;
	private int empage;
	private int empphone;
	private String empaddr;
	
	

}
