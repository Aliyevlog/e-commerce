package com.example.EcommerceMs.mapper;

import com.example.EcommerceMs.dto.ProductDto;
import com.example.EcommerceMs.dto.ShoppingSessionDto;
import com.example.EcommerceMs.entity.Product;
import com.example.EcommerceMs.entity.ShoppingSession;
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

public interface ShoppingSessionMapper {

    ShoppingSessionDto toDto(ShoppingSession shoppingSession);

    List<ShoppingSessionDto> toDtos(List<ShoppingSession> shoppingSessions);

    ShoppingSession fromDto(ShoppingSessionDto shoppingSessionDto);

    List<ShoppingSession> fromDtos(List<ShoppingSessionDto> shoppingSessionDto);
}
