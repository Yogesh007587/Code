package com.company;
import java.util.Scanner;
public class income_tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tax;
        System.out.print("Enter Salary in per annum:- ");
        long salary =sc.nextLong();
        if(salary>=250000 && salary<=500000){
            System.out.println("Your Tax amount is 5%");
            System.out.print("Amount to be payed:- ");
            System.out.println(tax = 5*salary/100);
        }
        else if (salary>500000 && salary<=1000000){
            System.out.println("Your Tax amount is 10% ");
            System.out.print("Amount to be payed:- ");
            System.out.println(tax = 10*salary/100);
        }
        else if(salary>1000000){
            System.out.println("Your Tax amount is 30%");
            System.out.print("Amount to be payed:- ");
            System.out.println(tax = 30*salary/100);
        }
        else
            System.out.println("No Tax has to be payed.!");
    }
}
