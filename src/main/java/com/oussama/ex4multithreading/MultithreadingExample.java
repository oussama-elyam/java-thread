package com.oussama.ex4multithreading;

//In this example, we create two threads (thread1 and thread2) that execute concurrently.
// Each thread counts from 1 to 5 and sleeps for 1 second between counts.
// The start() method is used to begin the execution of each thread, and join() is used to wait for both threads to finish before the main thread continues.
//
//When you run this program, you'll see that the two threads may interleave their execution,
// resulting in an output that shows concurrent execution.
// However, due to the use of Thread.sleep, the order of execution may vary with each run.
public class MultithreadingExample {
    public static void main(String[] args) {
        // Create and start the first thread
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 1: Count " + i);
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Create and start the second thread
        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 2: Count " + i);
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished.");
    }
}

