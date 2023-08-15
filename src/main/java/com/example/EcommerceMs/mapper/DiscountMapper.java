package com.example.EcommerceMs.mapper;

import com.example.EcommerceMs.dto.DiscountDto;
import com.example.EcommerceMs.entity.Discount;
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

public interface DiscountMapper {

    DiscountDto toDto(Discount discount);

    List<DiscountDto> toDtos(List<Discount> discount);

    Discount fromDto(DiscountDto discountDto);

    List<Discount> fromDtos(List<DiscountDto> discountDto);


}