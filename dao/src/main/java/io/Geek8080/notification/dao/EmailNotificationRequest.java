package io.Geek8080.notification.dao;

import lombok.Data;

/**
 * Created by Geek8080 on 17-02-2024.
 */

@Data
public class EmailNotificationRequest {

    private String emailId;

    private String message;

}
