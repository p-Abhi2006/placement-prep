package javacore.day08;

public class Student {

    String name;
    int age;

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        Student s = new Student("Abhishek", 20);

        s.displayDetails();
    }
}