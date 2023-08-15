package com.example.EcommerceMs.mapper;

import com.example.EcommerceMs.dto.UserPaymentDto;
import com.example.EcommerceMs.entity.UserPayment;
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

public interface UserPaymentMapper {

    UserPaymentDto toDto(UserPayment userPayment);

    List<UserPaymentDto> toDtos(List<UserPayment> userPayments);

    UserPayment fromDto(UserPaymentDto userPaymentDto);

    List<UserPayment> fromDtos(List<UserPaymentDto> userPaymentDto);
}
