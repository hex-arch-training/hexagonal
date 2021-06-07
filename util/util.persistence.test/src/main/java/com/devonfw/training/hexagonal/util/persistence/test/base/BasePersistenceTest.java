package com.devonfw.training.hexagonal.util.persistence.test.base;

import com.devonfw.training.hexagonal.util.persistence.test.configuration.TestConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import javax.transaction.Transactional;

@SpringBootTest
@ContextConfiguration(classes = TestConfiguration.class)
@Transactional
public class BasePersistenceTest {
  public static final String APPLICATION_BASE_PACKAGE = "com.devonfw.training.hexagonal";
}
