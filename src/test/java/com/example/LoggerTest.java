package com.example;

import junit.framework.TestCase;

public class LoggerTest extends TestCase {

    public void testSingletonInstance() {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        assertSame(logger1, logger2);
    }

    public void testLogging() {
        Logger logger = Logger.getInstance();
        logger.log("Тестове повідомлення.");
    }
}
