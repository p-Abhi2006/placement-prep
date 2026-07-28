package javacore.day06;

import static java.util.Collections.swap;
//pass by value

public class swapfunc
{
    public static void main(String[] args) {
        int a=10,b=20;
        swap(a,b);
        System.out.println("a:"+a+" b:"+b);
    }
    static void swap(int x,int y){
        int temp=x;
        x=y;
        y=temp;
        System.out.println("x:"+x+" y:"+y);
    }
//in java, while doing the thing in the above funcion,the copy of refernece variable is passed.
// that is the value to which the reference variable is pointing to is been passed.
// value is changed within the function only.
// In JAVA,there are no pointers,so there is no pass by reference.

}
