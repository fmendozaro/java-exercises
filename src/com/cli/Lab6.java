package com.cli;

import java.util.Scanner;

/**
 * Created by Fer on 8/24/16.
 */
public class Lab6 {

    public static String checkStr(String str){
        Lab6 obj = new Lab6();
        String res;
        if(obj.findVowel(str) != -1){
            res =str.concat("way");
        }else{
            res = str+"ay";
        }
        return res;
    }

    public static Integer findVowel(String str){
        for(int i = 0;i<str.length();i++){
            char ch = str.toLowerCase().charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        System.out.println("Welcome to the Pig Latin Translator!");
        System.out.println();
        String choice = "y";
        Lab6 obj = new Lab6();
        Scanner sc = new Scanner(System.in);
        while (choice.equalsIgnoreCase("y")){
            System.out.println("Enter the line you want to translate: ");
            String str = sc.nextLine();
            str = str.toLowerCase();
            str = obj.checkStr(str);
            System.out.println("Result: "+str);

            System.out.println("Do you wish to continue? y/n");
            choice = sc.next();
        }
    }
}
