package com.example.EcommerceMs.mapper;

import com.example.EcommerceMs.dto.CartItemsDto;
import com.example.EcommerceMs.entity.CartItems;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR)

public interface CartItemsMapper {

    CartItemsDto toDto(CartItems cartItems);

    List<CartItemsDto> toDtos(List<CartItems> cartItems);

    CartItems fromDto(CartItemsDto cartItemsDto);

    List<CartItems> fromDtos(List<CartItemsDto> cartItemsDto);
}
