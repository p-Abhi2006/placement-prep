package DSA.day14;

import java.util.Scanner;

public class Factorial_rec {
    public static int fact(int x){
if(x==0||x==1){
    return 1;
}
 return x*fact(x-1);
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int res = Factorial_rec.fact(num);
        System.out.println(res);
    }
}
