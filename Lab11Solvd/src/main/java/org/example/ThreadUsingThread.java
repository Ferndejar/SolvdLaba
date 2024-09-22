package org.example;

public class ThreadUsingThread extends Thread
{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread by extending class Thread "  + Thread.currentThread().getName() + " " + i);
        }
    }
}
