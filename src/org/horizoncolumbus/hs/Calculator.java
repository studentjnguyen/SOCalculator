package org.horizoncolumbus.hs;

import java.util.*;

public class Calculator {

    public static void main(String[] args) {
	// write your code here
        System.out.println("add, sub, mul, or div: ");
        Scanner input = new Scanner(System.in);
        String operationLower = input.next();
        String operation = operationLower.toLowerCase();
        System.out.println("1st number:");
        double numberFirst = input.nextInt();
        System.out.println("2nd number:");
        double numberSecond = input.nextInt();
        switch (operation) {
            case "add":
                double addition = numberFirst + numberSecond;
                System.out.println("Your result is: " + addition);
                break;
            case "sub":
                double subtraction = numberFirst - numberSecond;
                System.out.println("Your result is: " + subtraction);
                break;
            case "mul":
                double multiplication = numberFirst * numberSecond;
                System.out.println("Your result is: " + multiplication);
                break;
            case "div":
                double division = numberFirst / numberSecond;
                System.out.println("Your result is: " + division);
                break;
            default:
                System.out.println("Invalid input.");
        }
        input.close();
    }
}
