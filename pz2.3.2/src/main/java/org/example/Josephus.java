package org.example;

public class Josephus {

    // Метод для створення кільцевого списку
    public static Node createCircularList(int n) {
        Node head = new Node(0);
        Node prev = head;
        for (int i = 1; i < n; i++) {
            Node newNode = new Node(i);
            prev.next = newNode;
            prev = newNode;
        }
        prev.next = head; // замикаємо список в кільце
        return head;
    }

    // Метод для вирішення задачі Йосипа Флавія
    public static void josephus(int n, int m) {
        Node head = createCircularList(n);
        Node prev = null;

        while (head.next != head) {
            for (int i = 1; i < m; i++) {
                prev = head;
                head = head.next;
            }
            System.out.print(head.data + " ");
            prev.next = head.next; // видаляємо обраний вузол
            head = prev.next;
        }
        System.out.println(head.data); // виводимо останній залишившийся елемент
    }
}