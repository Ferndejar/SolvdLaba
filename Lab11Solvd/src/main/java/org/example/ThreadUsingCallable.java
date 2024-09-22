package org.example;

import java.util.concurrent.Callable;

public class ThreadUsingCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int count = 0;
        for (int i = 0; i < 100; i += 2) {
            System.out.println("Thread by implementing interface Callable "  + Thread.currentThread().getName() + " " + i);
            count += i;
        }
        return count;
    }
}
