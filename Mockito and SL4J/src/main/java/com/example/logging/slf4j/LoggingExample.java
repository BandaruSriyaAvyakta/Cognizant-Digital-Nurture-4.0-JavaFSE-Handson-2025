
package com.example.logging.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public void run() {
        logger.debug("Debug message");
        logger.info("Info message with parameter: {}", 42);
        logger.warn("Warning message");
        logger.error("Error message");
    }

    public static void main(String[] args) {
        new LoggingExample().run();
    }
}
