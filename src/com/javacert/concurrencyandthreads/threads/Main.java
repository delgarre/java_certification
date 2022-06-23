package com.javacert.concurrencyandthreads.threads;

import static com.javacert.concurrencyandthreads.threads.ThreadColor.ANSI_PURPLE;
import static com.javacert.concurrencyandthreads.threads.ThreadColor.ANSI_RED;

public class Main {
    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from the main thread");

        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        new Thread(){
            public void run(){
                System.out.println(ANSI_RED + "Hello from the anonymous class thread");
            }
        }.start();

        System.out.println(ANSI_PURPLE+"Hello again from the main thread");
    }
}
