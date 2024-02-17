package io.Geek8080.notification.producer;

import io.Geek8080.notification.dao.EmailNotificationRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Geek8080 on 17-02-2024.
 */

@RestController
@Log4j2
public class NotificationController {

    @PostMapping("sendEmail")
    public ResponseEntity<?> sendEmail(@RequestBody EmailNotificationRequest emailNotification) {
       log.info("Received a request to send email at: {}", emailNotification);

       return ResponseEntity.ok("SUCCESS");
    }
}
