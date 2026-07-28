package javacore.day06;

import java.util.Scanner;

public class Functionsdemo {

        public static int Addition(int x,int y){
            return x+y;
        }
        public static void main(String []args){
            Scanner in=new Scanner(System.in);
            int n1,n2;
            int n;
            System.out.println("Enter the number of times to repeat the process:");
            n=in.nextInt();
            while(n>0){
                System.out.println("Enter two numbers:");
                n1=in.nextInt();
                n2=in.nextInt();
                int Sum=Addition(n1,n2);
                System.out.println("SUM is:"+Sum);
                n--;
            }}
    }


