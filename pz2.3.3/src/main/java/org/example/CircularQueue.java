package org.example;

public class CircularQueue {
    private Node front, rear;

    public CircularQueue() {
        front = rear = null;
    }

    // Метод для додавання елементу в чергу
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        rear.next = front; // Замикаємо список в кільце
    }

    // Метод для видалення елементу з черги
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Черга порожня, видалення неможливе.");
            return -1;
        }
        int value;
        if (front == rear) { // Якщо в черзі тільки один елемент
            value = front.data;
            front = rear = null;
        } else {
            Node temp = front;
            value = temp.data;
            front = front.next;
            rear.next = front; // Зберігаємо кільцеву структуру
        }
        return value;
    }

    // Метод для перевірки, чи черга порожня
    public boolean isEmpty() {
        return front == null;
    }

    // Метод для виводу елементів черги
    public void print() {
        if (isEmpty()) {
            System.out.println("Черга порожня.");
            return;
        }
        Node temp = front;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != front);
        System.out.println();
    }
}