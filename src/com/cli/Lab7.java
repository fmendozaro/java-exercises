package com.cli;

import java.util.Scanner;

/**
 * Created by Fer on 8/29/16.
 */
public class Lab7 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to our Java class.  Which student would you like to learn more about? (enter a number 1-20): ");
        String choice = "y";
        String[][] names = {
                { "Gerrae", "Detroit", "Pizza" },
                { "Valerie", "Wisconsin", "Cake" },
                { "Latresha", "Flint", "Seafood" },
                { "Blair", "Troy", "Sushi" },
                { "Karen", "Ferndale", "Mexican" },
                { "Shruti", "Auburn Hills", "Indian" },
                { "Lily", "Commerce Township", "Steak" },
                { "Laurin", "Rochester Hills", "Sushi" },
                { "Kristen", "Sterling Heights", "Pizza" },
                { "Abbi", "East Lansing", "Pizza" },
                { "Tommy", "Southfield", "Chinese" },
                { "Ambyr", "Redford", "Coffee" },
                { "Amy", "Lapeer", "Seafood" },
                { "Jamila", "Chicago", "Crablegs" },
                { "DeeAnn", "Chicago", "Fettuccine Alfredo" },
                { "Vonnita", "Southfield", "Pizza as well as Chicken Pot Pies" },
                { "Tracy", "Holly", "Thai" },
                { "Noor", "will find out", "will found out" },
                { "Janna", "North Branch", "Watermelon & Steak" },
                { "Grace", "Fenton", "French Fries" } };

        while(choice.equalsIgnoreCase("y")){
            System.out.println("Here is a list of our students: ");
            int i = 1;
            for (String[] st: names) {
                System.out.println(i+": "+st[0]);
                i++;
            }
            System.out.println("Which student are we gonna talk about?");
            int student = sc.nextInt();
            while(student > 20 || student < 1){
                try{
                    throw new ArrayIndexOutOfBoundsException();
                }catch (Exception e){
                    System.out.println("That student does not exist.  Please try again. (enter a number 1-20)");
                }
                student = sc.nextInt();
            }

            String stName = names[student-1][0];
            String ffood = names[student-1][2];
            String hmtown = names[student-1][1];
            System.out.println("Student "+student+" is "+stName+".  What would you like to know about "+stName+"? (enter or “hometown” or “favorite food”)");

            String info = sc.next();
            System.out.println(info.toLowerCase().trim());
            if(info.trim().equalsIgnoreCase("hometown")){
                System.out.println(hmtown);
            }else if(info.trim().equalsIgnoreCase("favorite food")){
                System.out.println(ffood);
            }else{
                System.out.println("That data does not exist.  Please try again. (enter or “hometown” or “favorite food”): hometown");
            }

            System.out.println("Would you like to continue? y/n");
            choice = sc.next();
        }

    }
}
