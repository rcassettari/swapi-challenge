package br.com.mechanic.challenge.swapichallenge.dao;

import br.com.mechanic.challenge.swapichallenge.dto.request.NewUserDto;
import br.com.mechanic.challenge.swapichallenge.dto.request.UserChangePasswordRequestDto;
import br.com.mechanic.challenge.swapichallenge.dto.response.NewUserResponseDto;
import br.com.mechanic.challenge.swapichallenge.dto.response.UserForInternalAuthorizationResponseDto;
import br.com.mechanic.challenge.swapichallenge.exception.*;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface UserService {

    public UserForInternalAuthorizationResponseDto findByEmail(String email) throws UserNotFoundException;

    public NewUserResponseDto createUser(NewUserDto newUserDto) throws NewUserByDuplicatedEmailAddressNotAllowed,
            NewUserPasswordAndConfirmationPasswordNotMatchException;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void updateUserPassword(Long id, UserChangePasswordRequestDto userChangePasswordRequestDto)
            throws UserNotFoundException,
            NewUserPasswordAndConfirmationPasswordNotMatchException,
            UserNotAllowedException,
            UserToUpdateMustMatchWithUserFromMailAddressException;

}
