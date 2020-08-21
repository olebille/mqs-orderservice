package dk.obix.rabbitmqlesson.order.orderservicewebapp.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateOrderDto {
    private Long customerNumber;
}
