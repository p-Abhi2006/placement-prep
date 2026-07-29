package javacore.day07;

import java.util.Arrays;
import java.util.Scanner;

public class Twodarray {
    public static void main(String[] args) {
        int i;
        Scanner in=new Scanner(System.in);
        int[][] arr=new int[3][3];
        int[][] n={
            {1,2,3},
            {4,5,6},
            {7,8,9}};

        System.out.println("Enter the element of the array:");
        for( i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=in.nextInt();
            }
        }
        for( i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
        System.out.print(arr[i][j]+" ");
    }
            System.out.println(" ");
        }
//Arrays.toString()
        for( i=0;i<arr.length;i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
//for each loop
        for(int[] num:arr){
            System.out.println(Arrays.toString(num));
        }
    }
}
//Two D array is an array of 1D arrays
//Each inex of a 2D array has a one 1D array
//w can initialise an 2d array as  int[][] arr=new int[3][]; also
// for(int i=0;i<arr.length;i++) = for each row
//            for(int j=0;j<arr[i].length;j++) = for each column in a row