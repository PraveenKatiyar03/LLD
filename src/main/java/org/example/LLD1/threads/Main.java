package org.example.LLD1.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args){

//        for thread class
//        for(int i=1;i<=10;i++){
//            NumberPrinterUsingThreadClass thread = new NumberPrinterUsingThreadClass(i);
//            thread.start();
//        }

//        for runnable interface
//           for(int i=1;i<=10;i++) {
//               Runnable runnable = new NumberPrinterUsingRunnableInterface(i);
//               Thread thread = new Thread(runnable);
//               thread.start();
//           }

        // Using ExecutorService

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for(int i=1;i<=10;i++){
            Runnable printer = new NumberPrinterUsingRunnableInterface(i);
            executorService.execute(printer);
        }

    }

}
