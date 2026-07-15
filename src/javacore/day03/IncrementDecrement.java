package javacore.day03;

public class IncrementDecrement {
    public static void main(String[] args) {
    int a=10;
    System.out.print("a:"+a);
    int e=a++;                                   //Postfix increment
    System.out.println("a after increment:"+a);
    System.out.println("e:"+e);
    int b=++a;                                  //Prefix increment
    System.out.println("a after increment:"+a);
    System.out.println("b:"+b);
    int c=a--;                                   //Postfix decrement
    System.out.println("a after decrement:"+a);
    System.out.println("c:"+c);
    int d=--a;                                   //Prefix decrement
     System.out.println("a after decrement:"+a);
    System.out.println("d:"+d);
    a += 5;                                     //Addition Compound assignment
    System.out.println("a:"+a);

//    byte f=45;
//    f=f+5;
//    System.out.println("f:"+f);
//    java: incompatible types: possible lossy conversion from int to byte(only for normal)
        byte f=10;
        f+=5;
        System.out.println("f:"+f);
        //No problem for compound assignment
//        The compiler treats it approximately as:
//        b = (byte)(b + 5);

    }}
