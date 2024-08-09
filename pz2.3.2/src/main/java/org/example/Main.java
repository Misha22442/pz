package org.example;

import java.util.Scanner;

import static org.example.Josephus.josephus;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість людей (N): ");
        int N = scanner.nextInt();
        System.out.print("Введіть число M: ");
        int M = scanner.nextInt();

        System.out.println("Порядок вибування:");
        josephus(N, M);
    }
}