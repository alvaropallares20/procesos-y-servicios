package org.ejercicio1;


public class Main{
    public static void main(String[] args) {

        Thread sayHelloBye1 = new Thread(new SayHelloAndByeTask(3, "Hola", 10));
        Thread sayHelloBye2 = new Thread(new SayHelloAndByeTask(3, "Adiós", 10));
        sayHelloBye1.start();
        sayHelloBye2.start();
    }
}
