package org.example;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ThreadUsingThread threadUsingThread = new ThreadUsingThread();
        threadUsingThread.start();

        Thread threadUsingRunnable = new Thread(new ThreadUsingRunnable());
        threadUsingRunnable.start();

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future = executorService.submit(new ThreadUsingCallable());
        System.out.println("Result: " + future.get().intValue());
    }
}