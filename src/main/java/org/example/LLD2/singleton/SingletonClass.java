package org.example.LLD2.singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SingletonClass {

    static SingletonClass obj = null;

    public String sayhi = "Hii";

    private SingletonClass(){

    }
    static Lock lock = new ReentrantLock();

    public static SingletonClass getInstance(){
        if(obj == null){
            lock.lock();
            if(obj==null) {
                obj = new SingletonClass();
            }
            lock.unlock();
        }
        return obj;
    }

}
