package com.company;
import java.lang.invoke.SwitchPoint;
import java.util.Scanner;
public class day {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the code you want:- ");
        int dayy = sc.nextInt();

        switch (dayy){
            case 1 : System.out.println("Monday");
            break;
            case 2 : System.out.println("Tuesday");
            break;
            case 3 : System.out.println("Wednesday");
            break;
            case 4 : System.out.println("Thursday");
            break;
            case 5 : System.out.println("Friday");
            break;
            case 6 : System.out.println("Saturday");
            break;
            case 7 : System.out.println("Sunday");
            break;

        }
    }
}
