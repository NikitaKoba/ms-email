package com.example.msemail.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/email/")
public class EmailController {
    private static final Logger log = LoggerFactory.getLogger(EmailController.class);

    @PostMapping("/send")
    public ResponseEntity<String> sendEmail(){
        log.info("Email was sent");
        return ResponseEntity.ok("Email sent");
    }
}
