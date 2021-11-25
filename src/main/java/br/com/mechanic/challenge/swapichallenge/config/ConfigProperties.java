package br.com.mechanic.challenge.swapichallenge.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConfigProperties {

    @Value("${swapiChallenge.jwt.secret}")
    private String jwtSecret;

    @Value("${swapiChallenge.authorizationServer.client.clientId}")
    private String authorizationServerClientId;

    @Value("${swapiChallenge.authorizationServer.client.secret}")
    private String authorizationServerClientSecret;

    @Value("${swapiChallenge.authorizationServer.client.accessTokenValiditySeconds}")
    private int authorizationServerClientAccessTokenValiditySeconds;

    @Value("${swapiChallenge.authorizationServer.client.refreshTokenValiditySeconds}")
    private int authorizationServerClientRefreshTokenValiditySeconds;

    public String getJwtSecret() {
        return jwtSecret;
    }

    public String getAuthorizationServerClientId() {
        return authorizationServerClientId;
    }

    public String getAuthorizationServerClientSecret() {
        return authorizationServerClientSecret;
    }

    public int getAuthorizationServerClientAccessTokenValiditySeconds() {
        return authorizationServerClientAccessTokenValiditySeconds;
    }

    public int getAuthorizationServerClientRefreshTokenValiditySeconds() {
        return authorizationServerClientRefreshTokenValiditySeconds;
    }
}


