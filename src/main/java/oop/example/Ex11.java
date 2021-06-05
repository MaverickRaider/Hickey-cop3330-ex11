
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Hickey
 */

package oop.example;
import java.util.Scanner;
import java.lang.Math;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many euros are you exchanging?: ");
        double euros = scanner.nextDouble();

        System.out.println("What is the rate of exchange?: ");
        double rate = scanner.nextDouble();

        double dollars = euros * rate;
        double roundedDollars = Math.round(dollars * 100.0) / 100.0;

        System.out.println(euros + " euros at an exchange rate of " + rate + " is " + roundedDollars + " U.S. dollars.");
    }
}