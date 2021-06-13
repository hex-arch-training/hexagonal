package com.devonfw.training.hexagonal.business.ordermanagement.core.port.required.service;

import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity.Order;

public interface SendOrderConfirmationEmailServicePort {

  void sendOrderConfirmationEmail(String to, String subject, String content);
}