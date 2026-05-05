package com.ims.util;

import org.springframework.stereotype.Component;

@Component
public class EmailUtil {

    public void sendEmail(String to, String subject, String body) {
        System.out.println("Sending email to: " + to);
        System.out.println(subject);
        System.out.println(body);
    }
}
