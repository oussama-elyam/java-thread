# Multithreading Examples in Java

This repository contains several Java code examples that illustrate important concepts related to multithreading in Java, including:

## 1. Exception Handling

In the "ExceptionHandlingExample.java" file, you'll find an example of how to handle exceptions in a multithreaded program. The code creates a thread that may throw an `ArithmeticException`, and it demonstrates how to catch and handle this exception within the thread's execution.

## 2. Thread Safety

The "ThreadSafetyExample.java" file showcases the importance of writing thread-safe code. It demonstrates a simple counter class, which is accessed and modified by multiple threads concurrently. To ensure thread safety, the code uses synchronization mechanisms like the `synchronized` keyword to prevent race conditions and data corruption.

## 3. Synchronization

The "SynchronizationExample.java" file provides an example of thread synchronization in Java. It illustrates how to use the `synchronized` keyword to control access to shared resources. In this case, a counter class's methods are synchronized to ensure that only one thread can execute them at a time, preventing concurrent access issues.