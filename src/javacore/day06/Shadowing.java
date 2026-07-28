package javacore.day06;

public class Shadowing {
    static int c=40;
    public static void main(String[] args) {
        System.out.println(c);
        int c=90;
        System.out.println(c);
    }

}
//When two scopes overlapped,the higher scope is hidden.
//Here,line 4 is shadoed by line 6.
    //int x;
    //System.out.println(x);
    //x=10;
    //This will give an error if included in the main,as scope only begins with initialisation
    //not withn declaration
