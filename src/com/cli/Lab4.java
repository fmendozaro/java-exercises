package com.cli;

import java.util.Scanner;

/**
 * Created by Fer on 8/23/16.
 */
public class Lab4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        System.out.println("Welcome to the Factorial Calculator!");
        while (choice.equalsIgnoreCase("y")){
            System.out.println("Enter an integer that’s greater than 0 but less than 10: ");
            Integer input = sc.nextInt();
            Long fact = 1L;
            if(input < 0 || input > 10){
                System.out.println("The input is not valid");
                break;
            }

            for (int i=1;i<input;i++){
                fact += fact * i;
            }

            System.out.println("The factorial of "+input+" is "+fact);
            System.out.println("Do you wish to continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }

    }
}
