package com.question2;

public class B extends Thread{

    @Override
        public void run() {
        System.out.println("Start B ");
            for (int i=11 ;i<20;i++){

                System.out.println("inside run of class B"+i);

            }
        System.out.println("End B");
        }
    }
