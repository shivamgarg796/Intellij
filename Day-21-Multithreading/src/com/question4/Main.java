package com.question4;

public class Main {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();

        Thread t1=new Thread(a);
        Thread t2 =new Thread(b);

        t1.setName("Shivam");
        t2.setName("Abhishek");

        t1.start();
        t2.start();
    }
}
