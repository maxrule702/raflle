package com.company;

public class PrimeExample2 {
    static void checkPrime(int n) {
        int i, m = 0, flag = 0;
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println(n + " is not prime number");
            int win = 1;
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println("sorry you have not won ¯\\_(ツ)_/¯");
                    flag = 1;
                    int win = 0;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(" you have won congratulations");
            }
        }//end of else
    }
}
