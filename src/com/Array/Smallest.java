package com.Array;

public class Smallest {
    public static void main(String[] args) {

          int arr[] = { 54, 2, 1, 78, 98, 78};
         int min=arr[0] ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("smallest: " + min);
    }
}


