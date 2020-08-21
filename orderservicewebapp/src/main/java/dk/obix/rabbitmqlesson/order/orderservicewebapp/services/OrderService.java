package dk.obix.rabbitmqlesson.order.orderservicewebapp.services;

import dk.obix.rabbitmqlesson.order.orderservicewebapp.dtos.CreateOrderDto;
import dk.obix.rabbitmqlesson.order.orderservicewebapp.dtos.OrderDto;
import dk.obix.rabbitmqlesson.order.orderservicewebapp.models.Order;
import dk.obix.rabbitmqlesson.order.orderservicewebapp.repositories.OrderRepository;
import dk.obix.rabbitmqlesson.order.orderservicewebapp.transformers.OrderTransformer;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    private final OrderTransformer orderTransformer;

    public OrderService(OrderRepository orderRepository, OrderTransformer orderTransformer) {
        this.orderRepository = orderRepository;
        this.orderTransformer = orderTransformer;
    }

    @Transactional
    public OrderDto createOrder(CreateOrderDto orderDto) {
        Order order = orderTransformer.toModel(orderDto);
        orderRepository.save(order);
        return orderTransformer.toDto(order);
    }

    @Transactional
    public OrderDto getOrder(Long orderId) {
        Optional<Order> byId = orderRepository.findById(orderId);
        if (byId.isPresent()) {
            return orderTransformer.toDto(byId.get());
        } else {
            return null;

        }
    }
}
