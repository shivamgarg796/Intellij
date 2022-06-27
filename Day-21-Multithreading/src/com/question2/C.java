package com.question2;

public class C extends Thread{

        @Override
        public void run() {
            System.out.println("Start C ");
            for (int i=21 ;i<30;i++){

                System.out.println("inside run of class A"+i);

            }
            System.out.println("End C");
        }

}
