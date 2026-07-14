package javacore.day02;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.print("Enter an operator (+, -, *, /, %): ");
        char op = input.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Result = " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result = " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result = " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0)
                    System.out.println("Result = " + (num1 / num2));
                else
                    System.out.println("Division by zero is not possible.");
                break;
            case '%':
                System.out.println("Result = " + (num1 % num2));
                break;
            default:
                System.out.println("Invalid Operator");
        }

        input.close();
    }
}