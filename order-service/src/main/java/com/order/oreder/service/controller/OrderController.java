package com.order.oreder.service.controller;

import com.order.oreder.service.dto.OrderReqest;
import com.order.oreder.service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/order")
public class OrderController {

    @Autowired
    OrderService orderService;
    @PostMapping
    public String placeOrder(@RequestBody OrderReqest orderReqest) {
        orderService.placeOrder(orderReqest);
        return "Order placed Successfully";
    }
}
