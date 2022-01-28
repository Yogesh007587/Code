package com.company;

public class var_args {
    static int sum(int... arr){
        int result=0;
        for(int e:arr){
            result+=e;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("The sun of 3 and 4 is: " +sum(3,4));
        System.out.println("The sun of 3,5 and 4 is: " +sum(3,5,4));
        System.out.println("The sun of 3,5,6 and 4 is: " +sum(3,5,6,4));
        System.out.println("The sun of 3,6,7,5 and 4 is: " +sum(3,6,7,5,4));
    }
}
