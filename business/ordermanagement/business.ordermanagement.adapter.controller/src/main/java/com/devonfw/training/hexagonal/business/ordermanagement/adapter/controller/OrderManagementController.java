package com.devonfw.training.hexagonal.business.ordermanagement.adapter.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("ordermanagement")
public class OrderManagementController {

  @GetMapping("/ping")
  public void ping() {

  }
}
