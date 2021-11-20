package com.example;

public class BasicAuthenticator implements Authenticator {
  private final String username;
  private final String password;

  public BasicAuthenticator(String username, String password) {
    this.username = username;
    this.password = password;
  }

  @Override
  public String getUsername() {
    return username;
  }

  @Override
  public String getPassword() {
    return password;
  }
}
