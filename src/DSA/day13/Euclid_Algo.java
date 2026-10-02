package DSA.day13;

import java.util.Scanner;

public class Euclid_Algo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,n,r;
        m=sc.nextInt();
        n=sc.nextInt();
        while(n>0){
            r=m%n;
            m=n;
            n=r;
        }
        System.out.println(m);
    }
}
