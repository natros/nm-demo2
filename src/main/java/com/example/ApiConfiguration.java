package com.example;

import io.micronaut.context.annotation.ConfigurationProperties;

@ConfigurationProperties("my.api")
public class ApiConfiguration {
  private String url;
  private AuthenticatorConfiguration auth;

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public AuthenticatorConfiguration getAuth() {
    return auth;
  }

  public void setAuth(AuthenticatorConfiguration auth) {
    this.auth = auth;
  }

  @ConfigurationProperties("auth")
  public static class AuthenticatorConfiguration {
    private String username;
    private String password;
 
    public String getUsername() {
      return username;
    }

    public void setUsername(String username) {
      this.username = username;
    }

    public String getPassword() {
      return password;
    }

    public void setPassword(String password) {
      this.password = password;
    }
  }
}
