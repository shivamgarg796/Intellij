package com.question2;

public class Main {

    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        C c=new C();

        a.start();
        b.start();
        c.start();

        for (int i=100;i<1000;i=i+100){

            System.out.println("Inside main "+i);
        }
    }
}
