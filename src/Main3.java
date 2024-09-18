import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.UUID;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    //1. Класс "Человек"🛑
    class Person{
        private String name; private int age; private String gender;
        public Person(String name, int age, String gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }
        public void displayInfo() {
            System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender);
        }
        public void increaseAge() {
            age++;
        }
        public void changeName(String newName) {
            this.name = newName;
        }
    }
    //2. Наследование: Класс "Работник" и "Менеджер"🛑
    class Worker extends Person {
        private double salary;
        public Worker(String name, int age, String gender, double salary) {
            super(name, age, gender);
            this.salary = salary;
        }
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Salary: " + salary);
        }
    }
    class Manager extends Worker {
        private int numberOfSubordinates;

        public Manager(String name, int age, String gender, double salary, int numberOfSubordinates) {
            super(name, age, gender, salary);
            this.numberOfSubordinates = numberOfSubordinates;
        }
        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Number of Subordinates: " + numberOfSubordinates);
        }
    }
    //3. Полиморфизм: Животные🛑
    interface Animal {
        void makeSound();
    }
    class Dog implements Animal {
        public void makeSound() {
            System.out.println("Woof!");
        }
    }
    class Cat implements Animal {
        public void makeSound() {
            System.out.println("Meow!");
        }
    }
    class Cow implements Animal {
        public void makeSound() {
            System.out.println("Moo!");
        }
    }
    public class AnimalTest {
        public void main(String[] args) {
            Animal[] animals = { new Dog(), new Cat(), new Cow() };

            for (Animal animal : animals) {
                animal.makeSound();
            }
        }
    }
    //4. Абстрактный класс "Транспорт"🛑
    abstract class Transport {
        abstract void move();
    }
    class Car extends Transport {
        @Override
        void move() {
            System.out.println("Car is moving");
        }
    }
    class Bike extends Transport {
        @Override
        void move() {
            System.out.println("Bike is moving");
        }
    }
    //5. Класс "Книга" и "Библиотека"🛑
    class Book {
        private String title; private String author; private int year;
        public Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }
        public String getAuthor() {
            return author;
        }
        public int getYear() {
            return year;
        }

        @Override
        public String toString() {
            return "Title: " + title + ", Author: " + author + ", Year: " + year;
        }
    }
    class Library {
        private List<Book> books;
        public Library() {
            books = new ArrayList<>();
        }
        public void addBook(Book book) {
            books.add(book);
        }
        public List<Book> searchByAuthor(String author) {
            List<Book> result = new ArrayList<>();
            for (Book book : books) {
                if (book.getAuthor().equalsIgnoreCase(author)) {
                    result.add(book);
                }
            }
            return result;
        }
        public List<Book> searchByYear(int year) {
            List<Book> result = new ArrayList<>();
            for (Book book : books) {
                if (book.getYear() == year) {
                    result.add(book);
                }
            }
            return result;
        }
    }
    //6. Инкапсуляция: Банк🛑
    public class BankAccount {
        private String accountNumber;
        private double balance;
        public BankAccount(String accountNumber) {
            this.accountNumber = accountNumber;
            this.balance = 0.0;
        }
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: " + amount);
            } else {
                System.out.println("Deposit amount must be positive.");
            }
        }
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: " + amount);
            } else {
                System.out.println("Invalid withdrawal amount.");
            }
        }
        public double getBalance() {
            return balance;
        }
        public String getAccountNumber() {
            return accountNumber;
        }
    }
    //7. Счетчик объектов🛑
    public class Counter {
        private static int count = 0;
        public Counter() {
            count++;
        }
        public static int getCount() {
            return count;
        }
    }
    //8. Площадь фигур🛑
    abstract class Shape {
        abstract double getArea();
    }
    class Circle extends Shape {
        private double radius;
        public Circle(double radius) {
            this.radius = radius;
        }
        @Override
        double getArea() {
            return Math.PI * radius * radius;
        }
    }
    class Rectangle extends Shape {
        private double width;
        private double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }
        @Override
        double getArea() {
            return width * height;
        }
    }
    //9. Наследование: Животные и их движения🛑
    class Animal2 {
        public void move() {
            System.out.println("Animal moves");
        }
    }
    class Fish extends Animal2 {
        @Override
        public void move() {
            System.out.println("Fish swims");
        }
    }
    class Bird extends Animal2 {
        @Override
        public void move() {
            System.out.println("Bird flies");
        }
    }
    class Dogs extends Animal2 {
        @Override
        public void move() {
            System.out.println("Dog runs");
        }
    }
    //10. Работа с коллекциями: Университет🛑
    class Student {
        private String name; private String group; private double grade;
        public Student(String name, String group, double grade) {
            this.name = name;
            this.group = group;
            this.grade = grade;
        }
        public String getName() {
            return name;
        }
        public double getGrade() {
            return grade;
        }
        @Override
        public String toString() {
            return name + " (" + group + ") - " + grade;
        }
    }
    class University {
        private List<Student> students;
        public University() {
            students = new ArrayList<>();
        }
        public void addStudent(Student student) {
            students.add(student);
        }
        public void sortStudentsByName() {
            students.sort(Comparator.comparing(Student::getName));
        }
        public List<Student> filterStudentsByGrade(double minGrade) {
            List<Student> filteredStudents = new ArrayList<>();
            for (Student student : students) {
                if (student.getGrade() >= minGrade) {
                    filteredStudents.add(student);
                }
            }
            return filteredStudents;
        }
        @Override
        public String toString() {
            return students.toString();
        }
    }
    //11. Класс "Магазин"🛑
    class Product {
        private String name; private double price; private int quantity;
        public Product(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }
        public String getName() {
            return name;
        }
        public double getPrice() {
            return price;
        }
        public int getQuantity() {
            return quantity;
        }
        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    }
    class Store {
        private List<Product> products;

        public Store() {
            products = new ArrayList<>();
        }
        public void addProduct(Product product) {
            products.add(product);
        }
        public void removeProduct(String name) {
            products.removeIf(product -> product.getName().equals(name));
        }
        public Product findProductByName(String name) {
            for (Product product : products) {
                if (product.getName().equals(name)) {
                    return product;
                }
            }
            return null; // Product not found
        }
    }
    //12. Интерфейс "Платежная система"🛑
    interface PaymentSystem {
        void pay(double amount);
        void refund(double amount);
    }
    class CreditCard implements PaymentSystem {
        @Override
        public void pay(double amount) {
            System.out.println("Paid " + amount + " using Credit Card.");
        }

        @Override
        public void refund(double amount) {
            System.out.println("Refunded " + amount + " to Credit Card.");
        }
    }
    class PayPal implements PaymentSystem {
        @Override
        public void pay(double amount) {
            System.out.println("Paid " + amount + " using PayPal.");
        }

        @Override
        public void refund(double amount) {
            System.out.println("Refunded " + amount + " to PayPal.");
        }
    }
    //13. Генерация уникальных идентификаторов🛑 (теперь любимая задача)
    class UniqueID {
        private static int idCounter = 0;
        public static String generateUniqueID() {
            return UUID.randomUUID().toString() + "-" + (++idCounter);
        }
    }
    //14. Класс "Точка" и "Прямоугольник"🛑
    class Point {
        private double x; private double y;
        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }
    }
    class Rectangle2 {
        private Point topLeft;
        private Point bottomRight;

        public Rectangle2(Point topLeft, Point bottomRight) {
            this.topLeft = topLeft;
            this.bottomRight = bottomRight;
        }

        public double getArea() {
            double width = bottomRight.getX() - topLeft.getX();
            double height = topLeft.getY() - bottomRight.getY();
            return Math.abs(width * height);
        }
    }
    //15. Комплексные числа🛑
    class ComplexNumber {
        private double real;
        private double imaginary;

        public ComplexNumber(double real, double imaginary) {
            this.real = real;
            this.imaginary = imaginary;
        }

        public ComplexNumber add(ComplexNumber other) {
            return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
        }

        public ComplexNumber subtract(ComplexNumber other) {
            return new ComplexNumber(this.real - other.real, this.imaginary - other.imaginary);
        }
        public ComplexNumber multiply(ComplexNumber other) {
            double realPart = this.real * other.real - this.imaginary * other.imaginary;
            double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
            return new ComplexNumber(realPart, imaginaryPart);
        }
        public ComplexNumber divide(ComplexNumber other) {
            double denominator = other.real * other.real + other.imaginary * other.imaginary;
            double realPart = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
            double imaginaryPart = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
            return new ComplexNumber(realPart, imaginaryPart);
        }
    }
    //16. Перегрузка операторов: Матрица🛑 (помогите)
    class Matrix {
        private int[][] data;
        public Matrix(int rows, int cols) {
            data = new int[rows][cols];
        }
        public void setElement(int row, int col, int value) {
            data[row][col] = value;
        }
        public int getElement(int row, int col) {
            return data[row][col];
        }
        public Matrix add(Matrix other) {
            int rows = data.length;
            int cols = data[0].length;
            Matrix result = new Matrix(rows, cols);

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    result.setElement(i, j, this.getElement(i, j) + other.getElement(i, j));
                }
            }
            return result;
        }
        public Matrix multiply(Matrix other) {
            int rows = data.length;
            int cols = other.data[0].length;
            Matrix result = new Matrix(rows, cols);

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    for (int k = 0; k < other.data.length; k++) {
                        result.setElement(i, j, result.getElement(i, j) + this.getElement(i, k) * other.getElement(k, j));
                    }
                }
            }
            return result;
        }
    }
    //17. Создание игры с использованием ООП🛑
    class Player {
        private String name; private int health;
        public Player(String name) {
            this.name = name;
            this.health = 100;
        }
        public void attack(Enemy enemy) {
            System.out.println(name + " attacks " + enemy.getName());
            enemy.takeDamage(10);
        }
        public void takeDamage(int damage) {
            health -= damage;
            System.out.println(name + " takes " + damage + " damage. Health: " + health);
        }
    }
    class Enemy {
        private String name;
        private int health;

        public Enemy(String name) {
            this.name = name;
            this.health = 50;
        }

        public String getName() {
            return name;
        }

        public void takeDamage(int damage) {
            health -= damage;
            System.out.println(name + " takes " + damage + " damage. Health: " + health);
        }
    }
    class Weapon {
        private String name;
        private int damage;

        public Weapon(String name, int damage) {
            this.name = name;
            this.damage = damage;
        }

        public int getDamage() {
            return damage;
        }
    }
    //18. Автоматизированная система заказов🛑
    class Product2 {
        private String name;
        private double price;

        public Product2(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public double getPrice() {
            return price;
        }
    }
    class Customer {
        private String name;
        public Customer(String name) {
            this.name = name;
        }
    }
    class Order {
        private Customer customer;
        private List<Product> products;
        public Order(Customer customer) {
            this.customer = customer;
            products = new ArrayList<>();
        }
        public void addProduct(Product product) {
            products.add(product);
        }
        public double getTotalCost() {
            double total = 0;
            for (Product product : products) {
                total += product.getPrice();
            }
            return total;
        }
    }
    //19. Наследование: Электроника🛑
    class Device {
        protected String brand;
        public Device(String brand) {
            this.brand = brand;
        }
        public void turnOn() {
            System.out.println(brand + " device is turned on.");
        }
        public void turnOff() {
            System.out.println(brand + " device is turned off.");
        }
    }
    class Smartphone extends Device {

        public Smartphone(String brand) {
            super(brand);
        }

        public void takePhoto() {
            System.out.println(brand + " smartphone takes a photo.");
        }
    }
    class Laptop extends Device {

        public Laptop(String brand) {
            super(brand);
        }

        public void code() {
            System.out.println(brand + " laptop is coding.");
        }
    }
    //20. Игра "Крестики-нолики"🛑
    enum PlayerSymbol { X, O }
    class Player2 {
        private String name;
        private PlayerSymbol symbol;
        public Player2(String name, PlayerSymbol symbol) {
            this.name = name;
            this.symbol = symbol;
        }
        public String getName() {
            return name;
        }

        public PlayerSymbol getSymbol() {
            return symbol;
        }
    }
    class Game {
        private Player2[][] board;

        public Game() {
            board = new Player2[3][3];
        }

        public boolean makeMove(int row, int col, Player2 player) {
            if (board[row][col] == null) {
                board[row][col] = player;
                return true;
            }
            return false;
        }
    }
public class Main {

    public static void main(String[] args) {

    }
}