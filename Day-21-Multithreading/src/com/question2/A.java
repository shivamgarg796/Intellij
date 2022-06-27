package com.question2;

public class A extends Thread{
    @Override
    public void run() {
        System.out.println("Start A ");
        for (int i=0 ;i<10;i++){

            System.out.println("inside run of class A"+i);

        }
        System.out.println("End A");
    }
}
