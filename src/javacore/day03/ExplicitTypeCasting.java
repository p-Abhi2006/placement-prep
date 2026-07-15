package javacore.day03;

public class ExplicitTypeCasting {

    public static void main(String[] args) {

        // Explicit Type Casting (Narrowing Conversion)
        // Converts a larger data type into a smaller compatible data type.
        // It is done manually by the programmer using the casting operator.
        // Data loss may occur during narrowing conversion.

        // double -> int
        double d = 99.99;
        int i = (int) d;
        System.out.println("double to int: " + i);

        // double -> float
        double d1 = 25.75;
        float f = (float) d1;
        System.out.println("double to float: " + f);

        // long -> int
        long l = 5000000000L;
        int i1 = (int) l;

        System.out.println("long to int:"+i);

        // int -> short
        int n = 32000;
        short s = (short) n;
        System.out.println("int to short: " + s);

        // int -> byte
        int num = 120;
        byte b = (byte) num;
        System.out.println("int to byte: " + b);

        // float -> int
        float marks = 89.75f;
        int marksInt = (int) marks;
        System.out.println("float to int: " + marksInt);

        // double -> long
        double salary = 45890.99;
        long salaryLong = (long) salary;
        System.out.println("double to long: " + salaryLong);

        // int -> char
        int ascii = 65;
        char ch = (char) ascii;
        System.out.println("int to char: " + ch);

        // char -> byte
        char letter = 'A';
        byte asciiValue = (byte) letter;
        System.out.println("char to byte: " + asciiValue);
    }
}