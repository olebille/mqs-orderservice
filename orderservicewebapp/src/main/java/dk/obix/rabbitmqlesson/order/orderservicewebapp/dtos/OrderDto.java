package dk.obix.rabbitmqlesson.order.orderservicewebapp.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDto {
    private Long customerNumber;
    private Long orderId;
}
