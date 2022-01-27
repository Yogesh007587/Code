package com.company;

public class pattern {
    public static void main(String[] args) {

        for(int i=1;i<=5;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");


        }
        for(int i=5;i>=0;i--){
            for(int j=i;j>=1;j--){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        int i=5;
        for(i=5;i>=1;i--){
            for(int j=i;j>=2;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=5-i+1;k++){
                System.out.print("*");
            }
        System.out.print("\n");
        }
        int i1=5;
        for(i1=5;i1>=1;i1--){
            for(int j=i1;j>=2;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=2*(5-i1+1)-1;k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}

