package com.devonfw.training.hexagonal.util.mail;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MailService {

  private final MailSender mailSender;

  public boolean sendMail(String to, String subject, String content) {

    SimpleMailMessage message = new SimpleMailMessage();
    message.setTo(to);
    message.setSubject(subject);
    message.setText(content);
    try {
      this.mailSender.send(message);
      return true;
    } catch (Exception e) {
      return false;
    }
  }
}
