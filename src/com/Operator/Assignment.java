package com.Operator;

public class Assignment {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c;
        c=a+b;
        System.out.println("c = a+b= "+c);
        c+=a;
        System.out.println("c +=a = "+c);
        c-=a;
        System.out.println("c -=a = "+c);
        c*=a;
        System.out.println("c *=a= "+c);
        c/=a;
        System.out.println("c /=a= "+c);
        c%=a;
        System.out.println("c %=a= "+c);
        c<<=2;
        System.out.println("c <<=2= "+c);
        c>>=2;
        System.out.println("c >>=2= "+c);
        c>>=a;
        System.out.println("c >>=a= "+c);
        c&=a;
        System.out.println("c &=2 = "+c);
        c^=a;
        System.out.println("c ^=a ="+c);
        c|=a;
        System.out.println("c |=a ="+c);
    }
}
