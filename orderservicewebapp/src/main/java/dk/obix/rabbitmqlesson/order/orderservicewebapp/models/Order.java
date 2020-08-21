package dk.obix.rabbitmqlesson.order.orderservicewebapp.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "ORDER_TABLE")
public class Order {
    @Id
    @SequenceGenerator(name = "order_generator", sequenceName = "order_sequence", allocationSize = 100)
    @GeneratedValue(generator = "order_generator")
    private Long id;

    @Column(name = "CUSTOMER_NUMBER")
    private Long customerNumber;


}
