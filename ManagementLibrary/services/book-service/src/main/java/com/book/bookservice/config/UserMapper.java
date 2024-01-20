package com.book.bookservice.config;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);
    @Mapping(target = "password",ignore = true)
     User signUpToUser(SignUpDto userDto);

}
