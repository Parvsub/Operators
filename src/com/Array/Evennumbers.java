package com.Array;

public class Evennumbers {
    public static void main(String[] args) {
        int [] arreven=new int[100]; //Declaration and instantiation of array//
        int index=0;
        for( int i = 2; i <= 200; i++ ){
            //checking the logic for even numbers//
            if( i % 2 == 0){
                arreven[index] = i;
                System.out.println(index + "th element: "+arreven[index]);
                index++;
            }
        }
    }


    }

