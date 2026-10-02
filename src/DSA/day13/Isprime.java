package DSA.day13;

import java.util.Scanner;

public class Isprime {
    public static boolean isprime(int x){
        boolean c=true;
        if(x<=1){return false;}
        for(int i=2;i<=Math.sqrt(x);i++){
            if(x%i==0)return false;
        }
        return c;
    }
}
class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=in.nextInt();
        boolean check=Isprime.isprime(a);
        if(check==true)
            System.out.println("Prime");
        else System.out.println("Not Prime");
    }
}