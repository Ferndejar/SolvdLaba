package org.example;

public class ThreadUsingRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread by implementing interface Runnable "  + Thread.currentThread().getName() + " " + i);
        }
    }
}
