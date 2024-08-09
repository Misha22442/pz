package org.example;

public class Main {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        int[][] sequences = {
                {67, 22, 65, 17, 59, 80, 81, 63, 4, 71, 92, 97},
                {46, 14, 79, 22, 12, 77, 97, 41, 84, 9, 71, 44},
                {1, 73, 88, 62, 29, 57, 31, 12, 15, 69, 72, 31},
                {52, 34, 79, 31, 66, 60, 69, 59, 63, 13, 62, 60},
                {58, 68, 53, 72, 90, 74, 69, 53, 11, 70, 84, 73},
                {6, 35, 35, 58, 93, 40, 59, 81, 19, 3, 52, 33},
                {24, 45, 59, 19, 76, 85, 87, 69, 44, 72, 79, 96},
                {91, 43, 29, 56, 95, 67, 6, 14, 37, 77, 19, 93},
                {53, 96, 88, 50, 51, 98, 92, 95, 61, 14, 5, 30},
                {87, 68, 8, 30, 95, 44, 46, 66, 9, 24, 16, 64}
        };

        for (int i = 0; i < sequences.length; i++) {
            tree.root = null;
            for (int j = 0; j < sequences[i].length; j++) {
                tree.root = tree.insert(tree.root, sequences[i][j]);
            }
            System.out.print("Sequence " + (i + 1) + ": ");
            tree.preOrder(tree.root);
            System.out.println();
        }
    }
}