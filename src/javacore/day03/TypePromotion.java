package javacore.day03;

public class TypePromotion {

    public static void main(String[] args) {

        // 1. byte + byte -> int
        byte a = 10;
        byte b = 20;
        int sum = a + b;
        System.out.println("byte + byte = " + sum);

        // 2. short + short -> int
        short s1 = 100;
        short s2 = 200;
        int shortSum = s1 + s2;
        System.out.println("short + short = " + shortSum);

        // 3. char + char -> int (ASCII/Unicode values)
        char ch1 = 'A';
        char ch2 = 'B';
        int charSum = ch1 + ch2;
        System.out.println("char + char = " + charSum);

        // 4. byte + short -> int
        byte x = 5;
        short y = 10;
        int result1 = x + y;
        System.out.println("byte + short = " + result1);

        // 5. int + long -> long
        int num1 = 50;
        long num2 = 100L;
        long result2 = num1 + num2;
        System.out.println("int + long = " + result2);

        // 6. int + float -> float
        int i = 25;
        float f = 2.5f;
        float result3 = i + f;
        System.out.println("int + float = " + result3);

        // 7. long + float -> float
        long l = 100L;
        float f1 = 5.5f;
        float result4 = l + f1;
        System.out.println("long + float = " + result4);

        // 8. float + double -> double
        float f2 = 12.5f;
        double d = 4.75;
        double result5 = f2 + d;
        System.out.println("float + double = " + result5);

        // 9. Mixed-type expression
        byte p = 10;
        int q = 20;
        double r = 3.5;
        double result6 = p + q + r;
        System.out.println("Mixed expression = " + result6);

    }
}
//Java supports literal suffixes only for:
// L -> long
// F -> float
// D -> double (optional)

// byte and short do not have literal suffixes because
// integer literals are int by default, and Java allows
// assigning them to byte or short if the value fits
// within their respective ranges.