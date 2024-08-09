package org.example;

public class Main {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.print(); // Виводить: 10 20 30 40

        System.out.println("Видалено: " + queue.dequeue()); // Виводить: Видалено: 10

        queue.print(); // Виводить: 20 30 40

        queue.enqueue(50);

        queue.print(); // Виводить: 20 30 40 50
    }
}