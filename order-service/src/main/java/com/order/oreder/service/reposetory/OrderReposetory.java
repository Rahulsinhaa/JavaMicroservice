package com.order.oreder.service.reposetory;

import com.order.oreder.service.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderReposetory extends JpaRepository<Order, Long> {


}
