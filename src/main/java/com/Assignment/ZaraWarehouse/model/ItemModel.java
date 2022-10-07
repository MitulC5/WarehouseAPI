package com.Assignment.ZaraWarehouse.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Table(name="item")
@Data
public class ItemModel {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	private String itemid;
	private String itemname;
	private String itemcategory;
	private String itemcollection;
	private int itemquantity;
	private int itemprice;
	
}
