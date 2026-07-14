package javacore.day02;

import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.print("Enter an operator (+, -, *, /, %): ");
        char op = input.next().charAt(0);

        switch (op) {
            case '+' -> System.out.println("Result = " + (num1 + num2));
            case '-' -> System.out.println("Result = " + (num1 - num2));
            case '*' -> System.out.println("Result = " + (num1 * num2));
            case '/' -> {
                if (num2 != 0)
                    System.out.println("Result = " + (num1 / num2));
                else
                    System.out.println("Division by zero is not possible.");
            }
            case '%' -> System.out.println("Result = " + (num1 % num2));
            default -> System.out.println("Invalid Operator");
        }

        input.close();
    }
}