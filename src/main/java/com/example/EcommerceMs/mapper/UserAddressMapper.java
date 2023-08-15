package com.example.EcommerceMs.mapper;

import com.example.EcommerceMs.dto.UserAddressDto;
import com.example.EcommerceMs.entity.UserAddress;
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

public interface UserAddressMapper {

    UserAddressDto toDto(UserAddress userAddress);

    List<UserAddressDto> toDtos(List<UserAddress> userAddresses);

    UserAddress fromDto(UserAddressDto userAddressDto);

    List<UserAddress> fromDtos(List<UserAddressDto> userAddressDto);
}
