package com.devonfw.training.hexagonal.orchestration.main.completeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = Application.APPLICATION_BASE_PACKAGE)
@EnableJpaRepositories(Application.APPLICATION_BASE_PACKAGE)
@EntityScan(basePackages = Application.APPLICATION_BASE_PACKAGE)
public class Application {
  public static final String APPLICATION_BASE_PACKAGE = "com.devonfw.training.hexagonal";

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
