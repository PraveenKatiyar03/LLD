package org.example.LLD1.threads;


public class NumberPrinterUsingRunnableInterface implements Runnable{

    int number;

    public NumberPrinterUsingRunnableInterface(int number){
        this.number=number;
    }

    public void run(){
        System.out.println(this.number);
    }
}
