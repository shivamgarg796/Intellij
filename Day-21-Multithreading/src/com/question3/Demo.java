package com.question3;

public class Demo {
    public static void fun1(){
        for(int i=0; i<10 ;i++){
            System.out.println("Inside fun 1 of Demo :"+i);
        }
    }


    public static void main(String[] args) {
        Thread t1=new Thread(Demo::fun1);
        t1.start();

        Thread t2=new Thread(()->{
            for(int i=20; i<30 ;i++){
                System.out.println("Inside LE of Demo :"+i);
            }
        });

        t2.start();

        for(int i=200;i<2000;i=i+200){
            System.out.println("Inside Main "+i);
        }
    }
}
