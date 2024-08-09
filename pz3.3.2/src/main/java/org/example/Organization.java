package org.example;

public class Organization {
    // Кореневий вузол AVL дерева
    private Employee root;

    // Отримуємо висоту вузла
    private int height(Employee N) {
        // Якщо вузол є нульовим, повертаємо 0
        return (N == null) ? 0 : N.height;
    }

    // Отримуємо баланс-фактор вузла
    private int getBalance(Employee N) {
        // Якщо вузол є нульовим, повертаємо 0
        return (N == null) ? 0 : height(N.left) - height(N.right);
    }

    // Поворот вправо
    private Employee rightRotate(Employee y) {
        // Виконуємо обертання
        Employee x = y.left;
        Employee T2 = x.right;
        x.right = y;
        y.left = T2;

        // Оновлюємо висоти
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        // Повертаємо новий корінь
        return x;
    }

    // Поворот вліво
    private Employee leftRotate(Employee x) {
        // Виконуємо обертання
        Employee y = x.right;
        Employee T2 = y.left;
        y.left = x;
        x.right = T2;

        // Оновлюємо висоти
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        // Повертаємо новий корінь
        return y;
    }

    // Додавання нового вузла
    public Employee insert(Employee node, String name, int salary, IT pos) {
        // 1. Виконуємо стандартне додавання вузла до бінарного дерева пошуку
        if (node == null)
            return (new Employee(name, salary, pos));

        if (salary < node.salary)
            node.left = insert(node.left, name, salary, pos);
        else if (salary > node.salary)
            node.right = insert(node.right, name, salary, pos);
        else // Якщо зарплата однакова, пропускаємо
            return node;

        // 2. Оновлюємо висоту цього предка
        node.height = 1 + Math.max(height(node.left), height(node.right));

        // 3. Отримуємо баланс-фактор цього предка, щоб перевірити, чи збалансоване це дерево
        int balance = getBalance(node);

        // Якщо вузел став незбалансованим, є 4 випадки

        // Лівий Лівий випадок
        if (balance > 1 && salary < node.left.salary)
            return rightRotate(node);

        // Правий Правий випадок
        if (balance < -1 && salary > node.right.salary)
            return leftRotate(node);

        // Лівий Правий випадок
        if (balance > 1 && salary > node.left.salary) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Правий Лівий випадок
        if (balance < -1 && salary < node.right.salary) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        // Повертаємо незмінений вузол (якщо він збалансований)
        return node;
    }

    // Метод для додавання нового співробітника
    public void addEmployee(String name, int salary, IT pos) {
        root = insert(root, name, salary, pos);
    }

    // Метод для друкування дерева (наприклад, у порядку обробки вузлів)
    public void inOrder(Employee node) {
        if (node != null) {
            inOrder(node.left);
            System.out.println(node.name + " (" + node.salary + ")");
            inOrder(node.right);
        }
    }

    public void printInOrder() {
        inOrder(root);
    }
}