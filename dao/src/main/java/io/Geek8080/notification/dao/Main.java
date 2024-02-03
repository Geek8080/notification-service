package io.Geek8080.notification.dao;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;

/**
 * Created by Geek8080 on 02-02-2024.
 */
@Slf4j
public class Main {

    public static void main(String[] args) throws InterruptedException {
        log.info("Hello");
        Runtime.getRuntime().addShutdownHook(new Thread(LogManager::shutdown));
    }

}
