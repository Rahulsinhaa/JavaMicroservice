package com.order.inverntory.service.reposetory;

import com.order.inverntory.service.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InventoryReposetory extends JpaRepository<Inventory,Long> {
    Optional<Inventory> findBySkuCode(String skuCode);
}
