package com.Assignment.ZaraWarehouse.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Assignment.ZaraWarehouse.model.ItemModel;

@Repository
public interface ItemRepository extends CrudRepository<ItemModel,String>{

}
