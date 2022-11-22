package com.johnson.fun1;

public class Main {
    public static void main(String[] args) {
        // 1er approach -> con clase aparte que implemente Runnable
        Runnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable);
        thread1.start();

        // 2do approach -> con clase anónima
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world 2!");
            }
        });
        thread2.start();

        // 3er approach -> con lambda expression
        Thread thread3 = new Thread(() -> System.out.println("hello world 3!"));
        thread3.start();
    }
}
