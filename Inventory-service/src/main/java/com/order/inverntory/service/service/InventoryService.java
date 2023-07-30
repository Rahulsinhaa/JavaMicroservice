package com.order.inverntory.service.service;

import com.order.inverntory.service.reposetory.InventoryReposetory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {
    @Autowired
    InventoryReposetory inventoryReposetory;



    public boolean isInStack(String skuCode){
       return inventoryReposetory.findBySkuCode(skuCode).isPresent();
    }



}
