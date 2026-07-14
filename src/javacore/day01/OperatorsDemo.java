package javacore.day01;

public class OperatorsDemo {

    public static void main(String[] args) {

        int a = 15;
        int b = 4;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        System.out.println("a > b : " + (a > b));
        System.out.println("a == b : " + (a == b));

        System.out.println("Logical AND: " + (a > 10 && b < 10));
        System.out.println("Logical OR: " + (a < 10 || b < 10));
    }
}