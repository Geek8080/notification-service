module producer {
    requires dao;

    // Spring dependencies
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.web;

    requires static lombok;

    // Logging essentials
    requires org.slf4j;
    requires static org.apache.logging.log4j;
}