package org.example.LLD2.singleton;

public class Main {

    public static void main(String[] args) {

        SingletonClass sc= SingletonClass.getInstance();

        System.out.println(Thread.currentThread().getName());

        SingletonClass sc2 = SingletonClass.getInstance();

        System.out.println(sc.sayhi);
        System.out.println(sc2.sayhi);
    }
}
