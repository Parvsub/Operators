package com.Operator;

public class Bitwise {
    public static void main(String[] args) {
        int a=10;int b=13;
        int c;
        c=a&b;
        System.out.println("a&b="+c);
        c=a|b;
        System.out.println("a|b="+c);
        c=a^b;
        System.out.println("a^b="+c);
        c=~a;
        System.out.println("~a="+c);
        c=a<<2;
        System.out.println("a<<2="+c);
        c=a>>2;
        System.out.println("a>>2="+c);
        c=a>>>2;
        System.out.println("a>>>2="+c);

    }
}
