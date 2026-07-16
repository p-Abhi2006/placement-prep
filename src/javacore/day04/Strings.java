package javacore.day04;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
//     Java has 8 primitive data types:
//        byte
//        short
//        int
//        long
//        float
//        double
//        char
//        boolean
//
//        String is not one of them.
//
//        It is a class.
        //Creating strings
//        1)Using a string literal.
//        String language = "Java";
//        2)Using the new keyword.
//                String language = new String("Java");
  //reading a string
//        String name = input.next(); (Stops at space)
//        here,input is an object of Scanner class.
//        Read an entire sentence
//        String sentence = input.nextLine();  (it reads space also)
        Scanner in=new Scanner(System.in);

        String name="Abhishek";
        String sec=new String("A021");
        System.out.println("Enter your phone number");
                String phno= in.next();
                in.nextLine();
                System.out.println("Enter your field of interest:");
                        String interest=in.nextLine();
        System.out.printf("Name:%s\nClass:%s\n",name,sec);
        System.out.print("Phno:"+phno+"\n");
        System.out.println("Field of interest:"+interest);
    }
}
