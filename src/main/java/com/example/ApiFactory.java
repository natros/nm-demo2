package com.example;

import io.micronaut.context.annotation.Factory;
import jakarta.inject.Singleton;

@Factory
public class ApiFactory {
  @Singleton
  public Api api(ApiConfiguration conf, Authenticator auth) {
    return new Api(conf.getUrl(), auth);
  }
}
