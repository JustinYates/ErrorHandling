package com.company;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.println("Pick a number between 1 and 100:");

            input.nextInt();

        } catch (InputMismatchException ime) {
            System.out.println("You didn't type a number in try again, This is in our catch block");
            input.nextLine();
        }
        System.out.println("This is out of our try catch block");
        Main main = new Main();
        main.aTestMethod();
    }

    private void aTestMethod() throws ArithmeticException, InputMismatchException {

        System.out.println("What is the numerator you would like to divide? :");
        int num1 = input.nextInt();
        input.nextLine();
        System.out.println("What is the denominator you would like to divide? : ");
        int num2 = input.nextInt();
        input.nextLine();

        System.out.println(divide(num1, num2));

        System.out.println("After our throws");
    }

    private int divide(int a, int b) {

        if (b == 0) {
            throw new ArithmeticException("You can\'t divide by zero!");
        } else {
            return a / b;

        }

    }

    private int sum(Optional<Integer> a, Optional<Integer> b) {
        System.out.println("First parameter is present: " + a.isPresent());
        System.out.println("Second parameter is present: " + b.isPresent());

        Integer value1 = a.orElse(0);

        System.out.println(value1);
        {Integer value2 = b.get();


    }    Integer value1 = null;
        Integer value2 = 10;

        Optional<Integer> a = Optional.ofNullable(value1);

        Optional<Integer> b = Optional.of(value2);

    }
}
