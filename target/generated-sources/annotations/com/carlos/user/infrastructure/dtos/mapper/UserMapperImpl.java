package com.carlos.user.infrastructure.dtos.mapper;

import com.carlos.user.infrastructure.dtos.UserRequestDTO;
import com.carlos.user.infrastructure.dtos.UserResponseDTO;
import com.carlos.user.infrastructure.entity.UserEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-15T23:02:09-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.15 (Amazon.com Inc.)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserEntity toEntity(UserRequestDTO dto) {
        if ( dto == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setName( dto.getName() );
        userEntity.setPassword( dto.getPassword() );
        userEntity.setEmail( dto.getEmail() );
        userEntity.setPhone( dto.getPhone() );

        return userEntity;
    }

    @Override
    public UserResponseDTO toResponse(UserEntity entity) {
        if ( entity == null ) {
            return null;
        }

        UserResponseDTO userResponseDTO = new UserResponseDTO();

        userResponseDTO.setName( entity.getName() );
        userResponseDTO.setEmail( entity.getEmail() );

        return userResponseDTO;
    }
}
