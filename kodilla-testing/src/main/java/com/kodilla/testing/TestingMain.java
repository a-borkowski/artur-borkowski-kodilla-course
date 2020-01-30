package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error");
        }

        Calculator calculator = new Calculator();

        int resultAdd = calculator.addAToB(2, 1);
        if (resultAdd == 3) {
            System.out.println("test Add OK");
        } else {
            System.out.println("Error");
        }

        int resultSubtract = calculator.subtractAFromB(32, 2);
        if (resultSubtract == 30) {
            System.out.println("test Subtract OK");
        } else {
            System.out.println("Error");
        }
    }
}

