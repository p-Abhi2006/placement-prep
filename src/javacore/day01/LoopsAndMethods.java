package javacore.day01;

public class LoopsAndMethods {

    public static void main(String[] args) {

        System.out.println("For Loop");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("\nWhile Loop");
        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        System.out.println("\nDo While Loop");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 5);

        System.out.println("\nMethod Output");
        int result = add(10, 20);
        System.out.println("Addition = " + result);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}