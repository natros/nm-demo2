package com.example;

import com.example.ApiConfiguration.AuthenticatorConfiguration;
import io.micronaut.context.annotation.Factory;
import jakarta.inject.Singleton;

@Factory
public class AuthenticatorFactory {
  @Singleton
  public Authenticator authenticator(AuthenticatorConfiguration conf) {
    return new BasicAuthenticator(conf.getUsername(), conf.getPassword());
  }
}
