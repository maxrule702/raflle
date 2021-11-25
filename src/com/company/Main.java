package com.company;
import java.io.File;  // Import the File class
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import static com.company.PrimeExample2.checkPrime;

public class Main {


    public static void main(String[] args) {
    int placeholder = 0;

        while (placeholder !=1) {
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
                System.out.println("please enter your name");
                String name = input.next();
                System.out.println("generating number...");
                for (int i = 0; i <= 0; i++) {
                    int x = 1 + (int) (Math.random() * 100);
                    generatedNumber = x;
                    System.out.println("your number is " + generatedNumber);
                    System.out.println("checking number...");
                    checkPrime(generatedNumber);

                    try {
                        File myObj = new File("rafflePlayers.txt");
                        if (myObj.createNewFile()) {
                            System.out.println("File created: " + myObj.getName());
                        }
                        try {
                            FileWriter myWriter = new FileWriter("rafflePlayers.txt");
                            myWriter.write("name = " +name+"ticket = "+x+ "W/L?" );
                            myWriter.close();
                        } catch (IOException e) {
                            System.out.println("An error occurred.");
                            e.printStackTrace();
                        }





                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                }

                }








                System.out.println("would you like to check or buy a new ticket?");
                String again = input.next();
                if (again.equals("yes")) {
                    int restartCheck = 1;
                    switch (restartCheck) {
                        case 1:
                            System.out.println("restarting...");
                    }
                }
                   else{
                       int restartCheck =2;
                       switch (restartCheck) {
                        case 2:
                            System.out.println("goodbye");
                            placeholder++;
                            break;


                            }
                        }
                    }

               }
            }





