package br.com.mechanic.challenge.swapichallenge.mapper;

import br.com.mechanic.challenge.swapichallenge.dto.request.UserDtoRequest;
import br.com.mechanic.challenge.swapichallenge.dto.response.UserDtoResponse;
import br.com.mechanic.challenge.swapichallenge.entities.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDtoRequest userToUserDtoRequest(Usuario usuario);

    UserDtoResponse userToUserDtoResponse(Usuario usuario);

    Usuario userDtoRequestToUser(UserDtoRequest userDtoRequest);

    List<UserDtoRequest> usersToUsersDtoRequest(List<Usuario> usuarioList);

}