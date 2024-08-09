package org.example;

public class Main {
    public static void main(String[] args) {
        Organization organization = new Organization();

        organization.addEmployee("John Doe", 75000, IT.FULLSTACK_DEV);
        organization.addEmployee("Jane Smith", 50000, IT.FRONTEND_DEV);
        organization.addEmployee("Alice Johnson", 90000, IT.HQ);
        organization.addEmployee("Bob Brown", 80000, IT.BACKEND_DEV);

        organization.printInOrder(); // Вивід співробітників у порядку зростання зарплат
    }
}
