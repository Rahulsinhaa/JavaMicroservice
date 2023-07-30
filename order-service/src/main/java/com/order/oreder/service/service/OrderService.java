package com.order.oreder.service.service;

import com.order.oreder.service.dto.OrderLineItemsDto;
import com.order.oreder.service.dto.OrderReqest;
import com.order.oreder.service.model.Order;
import com.order.oreder.service.model.OrderLineItems;
import com.order.oreder.service.reposetory.OrderReposetory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class OrderService {
    @Autowired
    private OrderReposetory orderReposetory;

    public void placeOrder(OrderReqest orderReqest) {
        Order order = new Order();

        order.setOrderNumber(UUID.randomUUID().toString());

        List<OrderLineItems> orderLineItems = orderReqest.getOrderLineItemsDtoList().stream()
                                                      .map(orderLineItemsDto -> mapToDto(orderLineItemsDto)).toList();

        order.setOrederLineIntemsList(orderLineItems);
        orderReposetory.save(order);
    }

    private OrderLineItems mapToDto(OrderLineItemsDto orderLineItemsDto) {


        OrderLineItems orderLineItems = new OrderLineItems();
        orderLineItems.setPrice(orderLineItemsDto.getPrice());
        orderLineItems.setQuantity(orderLineItemsDto.getQuantity());
        orderLineItems.setSkuCode(orderLineItemsDto.getSkuCode());

        return orderLineItems;
    }

}
