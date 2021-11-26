package br.com.mechanic.challenge.swapichallenge.mapper;

import br.com.mechanic.challenge.swapichallenge.dto.request.NewUserDto;
import br.com.mechanic.challenge.swapichallenge.dto.request.UserDtoRequest;
import br.com.mechanic.challenge.swapichallenge.dto.response.NewUserResponseDto;
import br.com.mechanic.challenge.swapichallenge.dto.response.UserForInternalAuthorizationResponseDto;
import br.com.mechanic.challenge.swapichallenge.entities.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDtoRequest userToUserDtoRequest(Usuario usuario);

    NewUserResponseDto userToNewUserResponseDto(Usuario usuario);

    Usuario newUserDtoToUser(NewUserDto newUserDto);

    UserForInternalAuthorizationResponseDto userToUserForInternalAuthorizationResponseDto(Usuario usuario);

}