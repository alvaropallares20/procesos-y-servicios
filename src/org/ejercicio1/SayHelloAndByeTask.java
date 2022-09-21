package org.ejercicio1;

public class SayHelloAndByeTask implements Runnable{

    private int times;
    private String text;
    private int endTime;

    public SayHelloAndByeTask(int times, String text, int time) {
        this.times = times;
        this.text = text;
        this.endTime = time;
    }

    @Override
    public void run() {

        for(int i = 0; i < times; i ++){
            System.out.println(text);
        }try{
            Thread.sleep(endTime);
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
