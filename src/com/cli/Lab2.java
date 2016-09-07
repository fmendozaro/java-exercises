package com.cli;

import java.util.Scanner;

/**
 * Created by Fer on 8/18/16.
 */
public class Lab2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome, what's your name?");
        String name = sc.nextLine();
        String option = "yes";
        String choice = "";
        while (option.equalsIgnoreCase("yes")){
            System.out.println(name+", would you like to play the game? (Enter yes/no)");
            choice = sc.nextLine();
            switch (choice){
                case "yes":
                    System.out.println("History begins");
                    break;
                case "no":
                    System.out.println("History ends");
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }

        }
        System.out.println("Game ended");
    }

}
