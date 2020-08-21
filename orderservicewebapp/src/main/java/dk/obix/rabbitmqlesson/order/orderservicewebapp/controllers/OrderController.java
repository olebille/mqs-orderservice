package dk.obix.rabbitmqlesson.order.orderservicewebapp.controllers;

import dk.obix.rabbitmqlesson.order.orderservicewebapp.dtos.CreateOrderDto;
import dk.obix.rabbitmqlesson.order.orderservicewebapp.dtos.OrderDto;
import dk.obix.rabbitmqlesson.order.orderservicewebapp.services.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("order/{orderId}")
    public @ResponseBody
    ResponseEntity<OrderDto> getOrder(@PathVariable Long orderId) {
        return new ResponseEntity<>(orderService.getOrder(orderId), HttpStatus.OK);
    }

    @PostMapping(path = "order", consumes = "application/json")
    public ResponseEntity<OrderDto> orderCreate(@RequestBody CreateOrderDto orderDto) {
        return ResponseEntity.ok(orderService.createOrder(orderDto));
    }
}
