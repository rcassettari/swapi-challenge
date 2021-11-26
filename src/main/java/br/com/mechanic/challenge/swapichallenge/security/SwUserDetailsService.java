package br.com.mechanic.challenge.swapichallenge.security;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import br.com.mechanic.challenge.swapichallenge.dao.UserService;
import br.com.mechanic.challenge.swapichallenge.dto.response.UserForInternalAuthorizationResponseDto;

import br.com.mechanic.challenge.swapichallenge.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class SwUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        UserForInternalAuthorizationResponseDto userForInternalAuthorization = null;

        try
        {
            userForInternalAuthorization = userService.findByEmail(email);
        }
        catch(UserNotFoundException ex)
        {
            throw new UsernameNotFoundException("Usuário e/ou senha incorretos");
        }

        return new User(email, userForInternalAuthorization.getSenha(), getPermissoes(userForInternalAuthorization));
    }

    private Collection<? extends GrantedAuthority> getPermissoes(UserForInternalAuthorizationResponseDto userForInternalAuthorization) {
        Set<SimpleGrantedAuthority> authorities = new HashSet<>();
        userForInternalAuthorization.getPermissoes().forEach(p -> authorities.add(new SimpleGrantedAuthority(p.getDescricao().toUpperCase())));
        return authorities;
    }

}