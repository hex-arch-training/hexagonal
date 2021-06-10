package com.devonfw.training.hexagonal.business.ordermanagement.adapter.service.mail;


import com.devonfw.training.hexagonal.business.ordermanagement.core.port.required.service.SendOrderConfirmationEmailServicePort;
import com.devonfw.training.hexagonal.util.mail.MailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SendOrderConfirmationEmailService implements SendOrderConfirmationEmailServicePort {

  private final MailService mailService;

  @Override
  public void sendOrderConfirmationEmail(String to, String subject, String content) {
    this.mailService.sendMail(to, subject, content);
  }
}
