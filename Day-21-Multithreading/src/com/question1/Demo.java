package com.question1;

public class Demo implements Runnable {

    @Override
    public void run() {
        System.out.println("Start of run() ...");

        for (int i=0; i<20;i++){
            System.out.println("Inside run method of Demo"+i);
        }

        System.out.println("End of run() ...");
    }

    public static void main(String[] args) {

        Demo d =new Demo();

        Thread t1 =new Thread(d);
        t1.start();

        for (int i=0;i<20;i++){
            System.out.println("Inside main method of Demo"+i);
        }
    }
}
