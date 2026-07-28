package javacore.day06;

import java.util.Scanner;

public class Stringreturn {
    public static void example(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=in.next();
        System.out.print("NAME:"+name);
    }
    public static void main(String []args){
        example();
    }
}
