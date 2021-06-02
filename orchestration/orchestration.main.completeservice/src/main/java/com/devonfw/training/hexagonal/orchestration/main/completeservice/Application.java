package com.devonfw.training.hexagonal.orchestration.main.completeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.devonfw.training.hexagonal")
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
