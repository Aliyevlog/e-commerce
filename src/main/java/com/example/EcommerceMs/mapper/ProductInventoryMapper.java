package com.example.EcommerceMs.mapper;

import com.example.EcommerceMs.dto.ProductCategoryDto;
import com.example.EcommerceMs.dto.ProductInventoryDto;
import com.example.EcommerceMs.entity.ProductCategory;
import com.example.EcommerceMs.entity.ProductInventory;
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

public interface ProductInventoryMapper {

    ProductInventoryDto toDto(ProductInventory productInventory);

    List<ProductInventoryDto> toDtos(List<ProductInventory> productInventory);

    ProductInventory fromDto(ProductInventoryDto productInventoryDto);

    List<ProductInventory> fromDtos(List<ProductInventoryDto> productInventoryDto);
}
