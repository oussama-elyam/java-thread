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
                System.out.println("thread1 increment counter"+counter.getCount()+" i: "+i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int j = 0; j < 1000; j++) {
                counter.increment();
                System.out.println("thread2 increment counter "+counter.getCount()+" j: "+j);

            }
        });
        //we use .start for multiple concurency, if you use .run methode the thread2 will start after the thread 1 finish
        thread1.start();
        thread2.start();

        try {
            //You want to ensure that thread1 and thread2 complete their respective tasks before the main thread proceeds.
            // Without join, there's no guarantee of the order of execution.
            // Using join ensures that the main thread doesn't continue until both thread1 and thread2 have completed.
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Count: " + counter.getCount());
    }
}
