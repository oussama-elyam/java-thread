package com.oussama.ex3ThreadStates;


//This example demonstrates the various thread states such as NEW, RUNNABLE, and TERMINATED.
// Note that the thread may transition through other states, but these are the most commonly encountered ones.
public class ThreadStatesExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.println("Thread State (NEW): " + thread.getState());

        thread.start();
        System.out.println("Thread State (RUNNABLE): " + thread.getState());

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread State (TERMINATED): " + thread.getState());
    }
}
