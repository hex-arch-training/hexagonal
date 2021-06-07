package com.devonfw.training.hexagonal.business.bookingmanagement.adapter.persistence.testconfiguration;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = TestConfiguration.APPLICATION_BASE_PACKAGE)
@EnableJpaRepositories(TestConfiguration.APPLICATION_BASE_PACKAGE)
@EntityScan(basePackages = TestConfiguration.APPLICATION_BASE_PACKAGE)
public class TestConfiguration {
  public static final String APPLICATION_BASE_PACKAGE = "com.devonfw.training.hexagonal";
}
