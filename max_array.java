package com.company;

public class max_in_arr {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70,80,90,100};
        int max=0;
        for(int e:arr){
            if(e>max)
                max = e;

        }
        System.out.print("The maximum number in the array is:" +max);
    }
}
