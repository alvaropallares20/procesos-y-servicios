package org.ejercicio1;

public class HelloTask implements Runnable{


    private int numero;

    public HelloTask(int numero) {
        this.numero = numero;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++){
            System.out.println("Hello");
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        }

    }
}
