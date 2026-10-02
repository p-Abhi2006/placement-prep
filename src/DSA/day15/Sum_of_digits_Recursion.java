package DSA.day15;

import java.util.Scanner;

public class Sum_of_digits_Recursion {
public static int find_sum(int a){
    int sum=0;
    if(a==0) return 0;
    sum+=a%10+find_sum(a/10);
            return sum;
}
}

 class Main{
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
        System.out.print("Enter a number:");
    int n=in.nextInt();
    int res=Sum_of_digits_Recursion.find_sum(n);
    System.out.println(res);
    }
}
