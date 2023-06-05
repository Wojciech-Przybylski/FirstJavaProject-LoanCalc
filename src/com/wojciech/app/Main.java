package com.wojciech.app;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("¬Loan Calculator¬");
            while(true ) {
                System.out.println("" +
                        "\n\nWelcome! Please select an action you would like to carry out!" +
                        "\n1.Use the loan calculator" +
                        "\n2.Exit");

                Scanner scanner = new Scanner(System.in);

                switch(scanner.nextInt()) {
                    case 1:
                        System.out.println("Enter name:");

                        // String input
                        String name = scanner.nextLine();

                        System.out.println("Enter age:");
                        // Numerical input
                        int age = scanner.nextInt();

                        System.out.println("Enter salary:");
                        double salary = scanner.nextDouble();

                        // Output input by user
                        System.out.println("Name: " + name);
                        System.out.println("Age: " + age);
                        System.out.println("Salary: " + "£" + salary);

                        System.out.println("Enter loan amount:");
                        int loan_amount = scanner.nextInt();

                        System.out.println("Enter years for repayment:");
                        int number_of_years = scanner.nextInt();
                        double interest_rate = 10.0;

                        System.out.println("Loan calculated based on:");
                        System.out.println("Initial amount:    " + "£" + loan_amount);
                        System.out.println("Number of years:   " + number_of_years);
                        System.out.println("Interest Rate:     " + interest_rate + "%");

                        double payment = loan_amount * Math.pow((1 + (interest_rate / 100)), number_of_years);

                        String str = Double.toString(payment);
                        str = str.substring(0, 6).trim();

                        System.out.printf("Total Amount Due:  " + "£" + str);
                        continue;
                    case 2:
                        return;
                }
            }
        }
    }