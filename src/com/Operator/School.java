package com.Operator;
class school{}
class standard extends school{
    public static void main(String[] args) {
     standard a=new standard();
     boolean result=a instanceof school;
     System.out.println(result);
    }
}
