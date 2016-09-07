package com.cli;

import java.util.Scanner;

/**
 * Created by Fer on 8/17/16.
 */
public class Lab1 {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome!");
        String choice = "y";
        System.out.println();

        while(choice.equalsIgnoreCase("y")){
            System.out.println("Enter the length: ");
            Double lenght = sc.nextDouble();
            System.out.println("Enter the height: ");
            Double height = sc.nextDouble();
            System.out.println("Enter the width: ");
            Double width = sc.nextDouble();

            Double perimeter = (lenght + height) * 2;
            Double area = lenght * height;
            Double volume = lenght * height * width;

            System.out.println("The perimeter is: "+ perimeter);
            System.out.println("The area is: "+area);
            System.out.println("The volume is: "+volume);
            System.out.println();

            System.out.println("Do you want to continue? y/n");
            choice = sc.next();
        }
        System.out.println("Ended");
    }
}
