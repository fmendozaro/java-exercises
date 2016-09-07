package com.cli;

import java.util.Scanner;

/**
 * Created by Fer on 8/23/16.
 */
public class Lab5 {

    public static Integer generateRnd(Integer sides){
        Integer res = (int) Math.ceil(Math.random() * sides);
        return res;
    }

    public static void main(String[] args){
        Lab5 obj = new Lab5();
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        Integer i = 1;
        System.out.println("Welcome to the Casino!");
        while (choice.equalsIgnoreCase("y")){
            System.out.println("How many sides should each dice have?");
            Integer input = sc.nextInt();

            Integer rnd1 = obj.generateRnd(input);
            Integer rnd2 = obj.generateRnd(input);
            System.out.println("Roll "+i+": "+rnd1+" "+rnd2);
            System.out.println();
            System.out.println("Roll again? (y/n): ");
            choice = sc.next();
            System.out.println();
            i++;
        }

    }

}
