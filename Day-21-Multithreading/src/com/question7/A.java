package com.question7;

public class A implements Runnable{

    long product=1;
    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println("inside A thread");
            product = product * i;
        }
    }
}

class Main {
    public static void main(String[] args){
        A a1 = new A();
        Thread t = new Thread(a1);
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

            long result = a1.product;
            System.out.println("inside main thread....");
            System.out.println(result);
        }
    }

