package com.crosscampus.Test8;


public class SampleThread extends Thread{

    public void run(){

        System.out.println("Thread : "+ Thread.currentThread().getId() + " is Running");


    }
    public static void main(String[] args) {

//        System.out.println("Thread : "+ Thread.currentThread().getId() + " is Running");

        for (int i= 0;i<10;i++){

            SampleThread t1= new SampleThread();
            //Thread t2= new Thread("My Test 2");

            t1.start();
            //  t2.start();

         }
    }
}
