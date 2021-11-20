package com.example;

public class Api {
  private final String url;
  private final Authenticator authenticator;

  public Api(String url, Authenticator authenticator) {
    this.url = url;
    this.authenticator = authenticator;
  }

  public String getUrl() {
    return url;
  }

  public Authenticator getAuthenticator() {
    return authenticator;
  }
}
