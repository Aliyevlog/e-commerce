package com.example.EcommerceMs.mapper;

import com.example.EcommerceMs.dto.UserAddressDto;
import com.example.EcommerceMs.dto.UserDto;
import com.example.EcommerceMs.entity.User;
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

public interface UserMapper {
    UserDto toDto(User user);

    List<UserDto> toDtos(List<User> user);

    User fromDto(UserDto userDto);

    List<User> fromDtos(List<UserDto> userDto);
}
