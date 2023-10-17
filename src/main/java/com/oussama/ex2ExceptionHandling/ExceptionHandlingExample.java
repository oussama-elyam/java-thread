package com.oussama.ex2ExceptionHandling;


//In this example, we create a thread that may throw an ArithmeticException,
// and we handle it within the thread's run method.
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(1000);
                int result = 10 / 0; // This will throw an ArithmeticException
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted.");
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic error: " + e.getMessage());
            }
        });

        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread continues.");
    }
}
