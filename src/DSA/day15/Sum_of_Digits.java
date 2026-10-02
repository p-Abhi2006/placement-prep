package DSA.day15;

import java.util.Scanner;

public class Sum_of_Digits {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=in.nextInt();
        int sum=0;
        while(n>0){
            sum+=(n%10);
            n=n/10;
        }
        System.out.println(sum);
    }
}
