package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner a = new Scanner(System.in);

            System.out.println("Report Card");
            System.out.println("Marks got in English :-");
            int english_marks = a.nextInt();
            System.out.println("Marks got in Hindi:-");
            int hindi_marks = a.nextInt();
            System.out.println("Marks got in Computer :-");
            int computer_marks = a.nextInt();
            System.out.println("Marks got in Science :-");
            int science_marks = a.nextInt();
            System.out.println("Marks got in Maths :-");
            int maths_marks = a.nextInt();
            int sum = english_marks + hindi_marks + computer_marks + science_marks + maths_marks;
            float percentage = (sum*100)/500;
            System.out.println("Overall Percentage :- " +percentage);


    }
}
