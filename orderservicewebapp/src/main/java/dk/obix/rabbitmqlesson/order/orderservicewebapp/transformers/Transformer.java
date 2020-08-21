package dk.obix.rabbitmqlesson.order.orderservicewebapp.transformers;

public interface Transformer<ENTITY, DTO> {
    ENTITY toModel(DTO dto);

    DTO toDto(ENTITY model);
}
