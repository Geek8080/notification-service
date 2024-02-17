/**
 * Created by Geek8080 on 28-01-2024.
 */
module dao {
    requires static lombok;

    requires org.slf4j;
    requires static org.apache.logging.log4j;

    exports io.Geek8080.notification.dao;
}