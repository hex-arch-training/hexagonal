package com.devonfw.training.hexagonal.orchestration.main.completeservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ordermanagement2")
public class OrderManagementController2 {

  @GetMapping("/ping")
  public void ping() {

  }
}
