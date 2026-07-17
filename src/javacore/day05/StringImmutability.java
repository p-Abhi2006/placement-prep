package javacore.day05;

public class StringImmutability {
    public static void main(String[] args) {

        String s1 = "Java";

        System.out.println("Original String");
        System.out.println(s1);

        s1.concat(" Programming");

        System.out.println();
        System.out.println("After concat() without assignment");
        System.out.println(s1);

        s1 = s1.concat(" Programming");

        System.out.println();
        System.out.println("After concat() with assignment");
        System.out.println(s1);

        System.out.println();

        String s2 = "Hello";
        String s3 = s2;

        s2 = "World";

        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

    }
}
