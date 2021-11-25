package com.company;

import java.util.Scanner;

import static com.company.PrimeExample2.checkPrime;

public class Main {


    public static void main(String[] args) {
//        int day = 1;
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;

        int generatedNumber = 0;
                System.out.println("would you like to check a ticket or purchase one?");
        Scanner input = new Scanner(System.in);
        String userInput = input.next();
        if (userInput.equals("check")) {
            System.out.println("please enter your number");
            int numberCheck = input.nextInt();
            checkPrime(numberCheck);
        }
        if (userInput.equals("buy")) {
            System.out.println("generating number...");
            for (int i = 0; i <= 0; i++) {
                int x = 1 + (int) (Math.random() * 100);
            generatedNumber =  x;
            }
            System.out.println("your number is "+generatedNumber);
            System.out.println("checking number...");
            checkPrime(generatedNumber);
        }
    }
}


