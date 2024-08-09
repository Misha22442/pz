package org.example;

public class Employee {

    int height;
    int salary;
    String name;
    IT pos;
    Employee left, right;

    // Конструктор класу Employee
    Employee(String name, int salary, IT pos) {
        this.name = name;
        this.salary = salary;
        this.pos = pos;
        this.height = 1; // Початкова висота нового вузла
        this.left = this.right = null;
    }
}
