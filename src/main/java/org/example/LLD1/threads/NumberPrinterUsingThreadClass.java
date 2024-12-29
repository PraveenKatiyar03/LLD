package org.example.LLD1.threads;

public class NumberPrinterUsingThreadClass extends Thread{

    int number;

    public NumberPrinterUsingThreadClass(int number){
        this.number=number;
    }

    @Override
    public void run(){
        System.out.println(this.number);
    }

}
