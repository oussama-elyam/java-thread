package com.oussama.RunnableAndThreadExample;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable Thread: " + i);
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread Class Thread: " + i);
        }
    }
}

public class RunnableAndThreadExample {
    public static void main(String[] args) {
        // Create and start a thread using the Runnable interface
        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable);
        thread1.start();

        // Create and start a thread using the Thread class
        MyThread myThread = new MyThread();
        myThread.start();

        // Main thread continues here
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}
//summary
/*
- A class that implements Runnable is not a thread itself. Instead, it can be used to create multiple threads that execute the same task.
- A class that extends Thread is a thread itself, and you can create multiple thread objects with different behaviors by extending the Thread class for each

 chatgbt key diffrence between Runnable and Threads:

 Key differences:

Inheritance: When you use Runnable, your class can still inherit from other classes because it's not limited by single inheritance. When you extend the Thread class, you're using up your one chance for inheritance, which can limit flexibility.
Reusability: Using Runnable allows you to share the same Runnable instance with multiple threads, which can be more efficient and promotes thread reusability.
Separation of Concerns: Runnable separates the task (what you want to do) from the threading mechanism (how you want to do it), which is often considered a cleaner design.
Flexibility: Extending the Thread class can be more straightforward for simple cases where you don't need to share the thread behavior, but it's less flexible when you have multiple threads with the same behavior.
In general, it's recommended to use the Runnable interface for creating threads because it promotes better separation of concerns and flexibility. Extending the Thread class is less commonly used but may be simpler for very basic scenarios.

*/
