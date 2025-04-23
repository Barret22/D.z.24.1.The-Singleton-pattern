package com.example;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("Початок роботи програми.");

        simulateComponent();

        Logger logger2 = Logger.getInstance();
        if (logger1 == logger2) {
            logger1.log("Це один і той самий екземпляр Logger.");
        } else {
            logger1.log("❗ Singleton реалізовано неправильно!");
        }
    }

    public static void simulateComponent() {
        Logger logger = Logger.getInstance();
        logger.log("Повідомлення з іншої частини системи.");
    }
}
