package com.company;

import java.net.SocketOption;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	
        Scanner input = new Scanner(System.in);

        int number1=input.nextInt();
        int number2=input.nextInt();
        int number3=input.nextInt();

        int sum = number1 + number2 +number3 ;
        System.out.println(sum);
    }
}
