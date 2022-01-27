package com.company;

import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks got in science");
        int marks =sc.nextInt();

        System.out.println("Enter marks got in maths");
        int marks1 =sc.nextInt();

        System.out.println("Enter marks got in computer");
        int marks2 =sc.nextInt();

        int sum = marks + marks1 + marks2;
        int percentage = sum*100/300;
        System.out.println("Your Overall Percentage is: " +percentage);

        if(marks>=33 && marks1>=33 && marks2>=33){
            if(percentage>=40){
                System.out.println("PASS");
            }
            else{
                System.out.println("FAIL");
            }
        }
        else{
            System.out.println("Fail in one or more subject");
        }






    }
}
