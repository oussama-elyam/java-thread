# Multithreading Examples in Java

This repository contains several Java code examples that illustrate important concepts related to multithreading in Java, including:

## 1. Exception Handling

In the "ExceptionHandlingExample.java" file, you'll find an example of how to handle exceptions in a multithreaded program. 
The code creates a thread that may throw an `ArithmeticException`, and it demonstrates how to catch and handle this exception within the thread's execution.

## 2. Thread Safety and Synchronization

The "ThreadSafetyExample.java" file not only showcases the importance of writing thread-safe code but also provides an example of thread synchronization in Java. 
It illustrates how to use the `synchronized` keyword to control access to shared resources. 
In this case, a counter class's methods are synchronized to ensure that only one thread can execute them at a time, preventing concurrent access issues.

## 3. Multithreading Functions

In these examples, you will also learn about important multithreading functions, including:
- `.start()`: Starting a thread's execution.
- `.join()`: Waiting for a thread to complete its execution.
- `.sleep()`: Temporarily pausing a thread's execution.
- And more!

## 4. Differences Between Runnable and Thread

This repository will also explore the differences between using the `Runnable` interface and extending the `Thread` class to create and manage threads. 
Understanding when and how to use each approach is essential in multithreading.

## 5. Differences Between .start() and .run()

We will also delve into the distinctions between using `.start()` and `.run()` methods for starting threads. 
These differences have significant implications for how threads are executed and controlled in a multithreaded program.
