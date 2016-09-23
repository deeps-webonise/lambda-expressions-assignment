package com.webonise.applelambdaassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Application {
    private static final int CATEGORY_WEIGHT = 250;
    List<Apple> appleList;
    static final Logger logger = Logger.getLogger(Application.class.getName());

    Application() {
        appleList = new ArrayList<>();
    }

    void CalculateResult() {
        addApplestoList();

        IApple printAppleWeight = (apple) -> Integer.toString(apple.getWeight());
        IApple compareAppleWeight = (apple) -> (apple.getWeight() < CATEGORY_WEIGHT ? "LIGHT" : "HEAVY");

        prettyPrintApples(appleList, printAppleWeight);
        prettyPrintApples(appleList, compareAppleWeight);

    }

    private void prettyPrintApples(List<Apple> apples, IApple applePrinter) {
        for (Apple apple : apples) {
            logger.log(Level.INFO, "com.webonise.applelambdaassignment.Apple " + apple.getId() + " : " + applePrinter.appleOperation(apple));
        }
    }

    private void addApplestoList() {
        appleList.add(new Apple(1, 100, "red"));
        appleList.add(new Apple(2, 150, "green"));
        appleList.add(new Apple(3, 200, "red"));
        appleList.add(new Apple(4, 250, "green"));
        appleList.add(new Apple(5, 300, "red"));
        appleList.add(new Apple(6, 350, "green"));

    }
}