package com.oussama.ex1synchronization;

class MyCounter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}
//In this example, we use the synchronized keyword to ensure that only one thread can execute
// ... the increment() and getCount() methods at a time, preventing concurrent access issues.
public class SynchronizationExample {
    public static void main(String[] args) {
        MyCounter counter = new MyCounter();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Count: " + counter.getCount());
    }
}
