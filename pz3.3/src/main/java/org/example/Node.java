package org.example;

public class Node {
    int key;
    Node left;
    Node right;
    int height;

    Node(int key) {
        this.key = key;
        left = null;
        right = null;
        height = 1;
    }
}


