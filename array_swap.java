package com.company;

public class swap_array {
    public static void main(String[] args) {
          int[] arr ={10,20,30,4,50,60,70};
          int f=arr.length;
          int n = Math.floorDiv(f,2);
          int temp;

          for(int i=0;i<arr.length;i++){
              temp=arr[i];
              arr[i]=arr[f-i-1];
              arr[f-i-1]=temp;

          }
          for(int elements:arr){
              System.out.print(elements +" ");
          }
    }
}
