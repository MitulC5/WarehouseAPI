package com.Assignment.ZaraWarehouse.services;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Assignment.ZaraWarehouse.repository.ItemRepository;

import lombok.extern.java.Log;

import com.Assignment.ZaraWarehouse.model.ItemModel;
@Log
@Service
public class ItemService {

	
	@Autowired
	private ItemRepository itemRepository;
	
	
	public List getAllItems() {
		List<ItemModel> items=new ArrayList<ItemModel>();
		
		items= (List<ItemModel>)itemRepository.findAll();
		return items;
	}
	
	public ItemModel getItem(String id)
	{
		Optional<ItemModel> items = itemRepository.findById(id);
		
		return items.orElseGet(null);
	}
	
	
	public void addItems(ItemModel item)
	{
		itemRepository.save(item);
		
	}
	
	public ItemModel updateItem(String id,ItemModel item)
	{
		if(itemRepository.findById(id).isPresent()) {
			ItemModel i = itemRepository.findById(id).get();
			i.setItemname(item.getItemname());
			i.setItemcategory(item.getItemcategory());
			i.setItemcollection(item.getItemcollection());
			i.setItemquantity(item.getItemquantity());
			i.setItemprice(item.getItemprice());
			return itemRepository.save(i);
		}else {
			log.severe("Update Failed!");
			return null;
		}
		
//		if(getItem(id) != null)
//		{
//			return (ItemModel) itemRepository.save(item);
//		}
//		else
//		{
//			return null;
//		}
		
	}
	
	public void deleteItem(String id) {
		itemRepository.deleteById(id);
		
	}	
}
