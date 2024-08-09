package org.example;

public class Stack {
    private int top;
    private int[] storage;

    public Stack(int capacity) {
        storage = new int[capacity];
        top = -1;
    }

    public boolean push(int data) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + data);
            return false;
        }
        storage[++top] = data;
        return true;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
        return storage[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return storage[top];
    }

    public int size() {
        return top + 1;
    }

    public boolean isFull() {
        return top == storage.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}