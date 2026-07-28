package javacore.day06;

import java.util.Arrays;

public class Varargs {
    //When we dont know how much arguments are to be passed,this is variable length arguments
    public static void main(String[] args) {
        fun(1,2,3,4,5,6,7,8);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
//Method overloading is in compile time

//it is with different type signature
