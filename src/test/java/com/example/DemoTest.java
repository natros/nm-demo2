package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@MicronautTest
class DemoTest {
  @Inject Api api;

  @Test
  @DisplayName("test api")
  void test_api() {
    assertEquals("http://localhost", api.getUrl());
    assertEquals("filipe", api.getAuthenticator().getUsername());
    assertEquals("filipe123", api.getAuthenticator().getPassword());
  }
}
