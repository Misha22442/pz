package org.example;

public interface StackInterface {
    boolean push(int data);
    int pop();
    int peek();
    int size();
    boolean isFull();
    boolean isEmpty();
}