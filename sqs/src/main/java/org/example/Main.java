package org.example;

import static org.example.InsertionSortLinkedList.insertionSort;
import static org.example.InsertionSortLinkedList.printList;

public class Main {
    public static void main(String[] args) {
        Node head = new Node(13); // зв'язний список
        head.next = new Node(56);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(41);
        head.next.next.next.next.next = new Node(14);
        head.next.next.next.next.next.next = new Node(7);
        System.out.println("Original List:");
        printList(head);

        head = insertionSort(head);

        System.out.println("Sorted List:");
        printList(head);
    }
}