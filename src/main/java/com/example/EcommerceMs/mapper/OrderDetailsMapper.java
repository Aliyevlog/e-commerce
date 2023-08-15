package com.example.EcommerceMs.mapper;

import com.example.EcommerceMs.dto.DiscountDto;
import com.example.EcommerceMs.dto.OrderDetailsDto;
import com.example.EcommerceMs.entity.Discount;
import com.example.EcommerceMs.entity.OrderDetails;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)

public interface OrderDetailsMapper {

    OrderDetailsDto toDto(OrderDetails orderDetails);

    List<OrderDetailsDto> toDtos(List<OrderDetails> orderDetails);

    OrderDetails fromDto(OrderDetailsDto orderDetailsDto);

    List<OrderDetails> fromDtos(List<OrderDetailsDto> orderDetailsDtos);


}
