package javacore.day06;

public class changevalue {
    public static void main(String[] args) {
        int a =10,b=20;
        System.out.println("Values before swap");
        System.out.println("a:"+a+" b:"+b);
        swap(a,b);
        System.out.println("Values after swap");
        System.out.println("a:"+a+" b:"+b);
    }
    static void swap(int a,int b) {
        a = 20;
        b = 10;
    }}
//here values are changed as both the parametes and variables are the same.(same object)
//not new objects are created.