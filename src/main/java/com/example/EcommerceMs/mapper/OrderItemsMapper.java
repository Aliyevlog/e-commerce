package com.example.EcommerceMs.mapper;

import com.example.EcommerceMs.dto.OrderItemsDto;
import com.example.EcommerceMs.entity.OrderItems;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)

public interface OrderItemsMapper {

    OrderItemsDto toDto(OrderItems orderItems);

    List<OrderItemsDto> toDtos(List<OrderItems> orderItems);

    OrderItems fromDto(OrderItemsDto orderItemsDto);

    List<OrderItems> fromDtos(List<OrderItemsDto> orderItemsDto);
}
