package com.order.oreder.service.dto;

import com.order.oreder.service.model.OrderLineItems;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.function.Predicate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderReqest {

    private List<OrderLineItemsDto> orderLineItemsDtoList;
}
