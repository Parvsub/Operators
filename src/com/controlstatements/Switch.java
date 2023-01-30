package com.controlstatements;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args)
    {
        System.out.println("Enter the char:");
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        switch (a){
            case"a":
                System.out.println("One");
                break;
            case"b":
                System.out.println("two");
                break;
            case"c":
                System.out.println("three");
                break;
            default:
                System.out.println("Invalid");
        }


    }
}
