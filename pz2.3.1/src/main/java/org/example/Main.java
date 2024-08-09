package org.example;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5); // create a stack with capacity 5

        System.out.println("Is stack empty? " + stack.isEmpty()); // true

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack size: " + stack.size()); // 3
        System.out.println("Top element: " + stack.peek()); // 3

        int popped = stack.pop();
        System.out.println("Popped element: " + popped); // 3

        System.out.println("Stack size: " + stack.size()); // 2

        stack.push(4);
        stack.push(5);

        System.out.println("Is stack full? " + stack.isFull()); // true

        try {
            stack.push(6); // this will fail because the stack is full
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Stack size: " + stack.size()); // 5

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " "); // 5 4 2 1
        }

        System.out.println("\nIs stack empty? " + stack.isEmpty()); // true
    }
}