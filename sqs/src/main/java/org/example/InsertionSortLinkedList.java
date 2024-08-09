package org.example;

public class InsertionSortLinkedList {

    // Метод для сортировки списка вставками
    public static Node insertionSort(Node head) {
        Node sorted = null;
        Node curr = head;

        while (curr != null) {
            Node currNext = curr.next;
            sorted = sortedInsert(sorted, curr);
            curr = currNext;
        }

        return sorted;
    }

    // Метод для вставки узла в отсортированный список
    public static Node sortedInsert(Node sorted, Node newNode) {
        if (sorted == null || sorted.data > newNode.data) {
            newNode.next = sorted;
            sorted = newNode;
        } else {
            Node curr = sorted;
            while (curr.next != null && curr.next.data <= newNode.data) {
                curr = curr.next;
            }
            newNode.next = curr.next;
            curr.next = newNode;
        }
        return sorted;
    }

    // Метод для вывода списка
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}