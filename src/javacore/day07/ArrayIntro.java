package javacore.day07;

import java.util.Scanner;

public class ArrayIntro {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the roll numbers of students:");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println("Roll no. of student"+(i+1)+" is:");
            System.out.println(arr[i]);
        }
    }
}
