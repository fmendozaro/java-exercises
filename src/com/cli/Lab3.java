package com.cli;

import java.util.Scanner;

/**
 * Created by Fer on 8/22/16.
 */
public class Lab3 {

    public static void main(String[] args){
        String choice = "y";
        Scanner sc = new Scanner(System.in);
        System.out.println("Learn your squares and cubes!");
        while (choice.equalsIgnoreCase("y")){
            System.out.println("Give me an integer number: ");
            Integer num = sc.nextInt();
            Integer i = num;
            System.out.println("Number | Squared | Cubed");
            System.out.println("------------------------------");
            while (i != 0){
                Integer sq = i*i;
                Integer cb = i*i*i;
                System.out.println(i+"   |   "+sq+"   |   "+cb);
                i--;
            }
            System.out.println("Do you wish to continue? y/n");
            choice = sc.next();
            System.out.println();
        }

    }
}
