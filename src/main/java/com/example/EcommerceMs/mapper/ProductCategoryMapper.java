package com.example.EcommerceMs.mapper;

import com.example.EcommerceMs.dto.ProductCategoryDto;
import com.example.EcommerceMs.entity.ProductCategory;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE )

public interface ProductCategoryMapper {

    ProductCategoryDto toDto(ProductCategory productCategory);

    List<ProductCategoryDto> toDtos(List<ProductCategory> productCategories);

    ProductCategory fromDto(ProductCategoryDto productCategoryDto);

    List<ProductCategory> fromDtos(List<ProductCategoryDto> productCategoryDto);
}


