package dk.obix.rabbitmqlesson.order.orderservicewebapp.transformers;

import dk.obix.rabbitmqlesson.order.orderservicewebapp.dtos.CreateOrderDto;
import dk.obix.rabbitmqlesson.order.orderservicewebapp.dtos.OrderDto;
import dk.obix.rabbitmqlesson.order.orderservicewebapp.models.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderTransformer implements Transformer<Order, OrderDto> {
    @Override
    public Order toModel(OrderDto orderDto) {
        Order model = new Order();
        model.setCustomerNumber(orderDto.getCustomerNumber());
        return model;
    }

    @Override
    public OrderDto toDto(Order model) {
        OrderDto orderDto = new OrderDto();
        orderDto.setCustomerNumber(model.getCustomerNumber());
        orderDto.setOrderId(model.getId());
        return orderDto;
    }

    public Order toModel(CreateOrderDto createOrderDto) {
        Order model = new Order();
        model.setCustomerNumber(createOrderDto.getCustomerNumber());
        return model;
    }
}
