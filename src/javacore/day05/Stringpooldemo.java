package javacore.day05;

public class Stringpooldemo {
    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Java";

        System.out.println("String Literals");
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s1 == s2 : " + (s1 == s2));

        System.out.println();

        String s3 = new String("Java");
        String s4 = new String("Java");

        System.out.println("Using new Keyword");
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);
        System.out.println("s3 == s4 : " + (s3 == s4));

        System.out.println();

        System.out.println("Literal vs new");
        System.out.println("s1 == s3 : " + (s1 == s3));

    }
}

