package com.gc;

import java.util.Scanner;
/**
 * Created by Ny Derry on 7/30/2017.
 */


public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int input = 0;
        int num = 1;
        int count = 1;
        int i;


        System.out.println("Let's locate some primes!\n");

        System.out.println("This application will find you any prime, in order, from first prime number on");

        String contin1 = "y";

        while (contin1.equalsIgnoreCase("y")) {
            System.out.println("Which prime number are you looking for?");
            input = scnr.nextInt();
            System.out.println("The " + input + "th prime number is " + primeNumber(input));
            System.out.println("Do you want to find another prime number? (y/n)");
            scnr.nextLine();

            contin1 = scnr.nextLine();

        }

        if (contin1.equalsIgnoreCase("n")) {
            System.out.println("This end your session. Bye!");

        }
    }

    public static int primeNumber(int input) {
        int num = 1;
        int count = 1;
        int i;

        while (count < input + 1) {
            num += 1;

            for (i = 2; i < num + 1; i++) {
                if (num % i == 0) {
                    break;
                }

            }
            if (i == num) {
                count += 1;
            }
        }
        return num;

    }
    //put before method
    //  if (contin1.equalsIgnoreCase("n")) {
    // System.out.println("This end your session. Bye!");
}

//Prime Numbers from 1-100 are; 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97