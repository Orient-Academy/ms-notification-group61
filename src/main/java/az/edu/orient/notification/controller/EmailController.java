package az.edu.orient.notification.controller;

import az.edu.orient.notification.model.EmailDto;
import az.edu.orient.notification.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/send-email")
public class EmailController {

    @Autowired
    private MailService emailService;

    @PostMapping
    public String sendEmail(@RequestBody EmailDto emailDto) {
        emailService.sendEmail(emailDto.getTo(), emailDto.getSubject(), emailDto.getBody());
        return "OK";
    }
}