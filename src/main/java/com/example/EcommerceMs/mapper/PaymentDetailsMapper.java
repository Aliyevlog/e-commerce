package com.example.EcommerceMs.mapper;

import com.example.EcommerceMs.dto.PaymentDetailsDto;
import com.example.EcommerceMs.entity.PaymentDetails;
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

public interface PaymentDetailsMapper {

    PaymentDetailsDto toDto(PaymentDetails paymentDetails);

    List<PaymentDetailsDto> toDtos(List<PaymentDetails> paymentDetails);

    PaymentDetails fromDto(PaymentDetailsDto paymentDetailsDto);

    List<PaymentDetails> fromDtos(List<PaymentDetailsDto> paymentDetailsDto);
}
