package com.company;
import java.util.Scanner;
public class multidimensional_array {
    public static void main(String[] args) {
        int[][] array=new int[2][3];
        array[0][0] = 101;
        array[0][1] = 102;
        array[0][2] = 103;
        array[1][0] = 104;
        array[1][1] = 105;
        array[1][2] = 106;

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");

        }

    }
}
