package dk.obix.rabbitmqlesson.order.orderservicewebapp.repositories;

import dk.obix.rabbitmqlesson.order.orderservicewebapp.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
