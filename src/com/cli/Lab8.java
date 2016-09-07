package com.cli;

import java.util.Scanner;

/**
 * Created by Fer on 9/6/16.
 */
public class Lab8 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Batting Average Calculator!");
        System.out.println("Enter number of times at bat:");
        Integer numberBats = sc.nextInt();
        Integer[] bases = new Integer[numberBats];
        System.out.println("0=out, 1=single, 2=double, 3=triple, 4=home run");
        for (int i=1;i<=numberBats;i++) {
            System.out.println("Result for at-bat "+i+": ");
            Integer base = sc.nextInt();
            while(base < 0 || base > 4){
                System.out.print("Invalid entry.  Please try again.  Result for at-bat " + i + ": ");
                base = sc.nextInt();
            }
            bases[i-1] = base;
        }

        int hits = 0;
        int totalBases = 0;
        for (int i : bases) {
            if (i > 0){
                hits++;
            }
            totalBases += i;
        }

        double battingAvg = (double) hits/numberBats;
        double sluggingPct = (double) totalBases/numberBats;

        System.out.printf("Batting Average: %.2f \n", battingAvg);
        System.out.printf("Slugging Percentage: %.2f \n", sluggingPct);

    }
}
