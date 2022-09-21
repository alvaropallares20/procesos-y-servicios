package org.example;

import org.example.HelloWorldTask;

public class Main {
    public static void main(String[] args)  {

       Thread helloWorldThread = new Thread(new HelloWorldTask());
       helloWorldThread.start();

       try{
           Thread.sleep(1000);
       }catch (InterruptedException e){
           System.out.printf("Ha habido un error");
       }

       System.out.println("Goodbye");
    }
}