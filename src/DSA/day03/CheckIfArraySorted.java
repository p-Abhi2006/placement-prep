package DSA.day03;

import java.util.Scanner;

public class CheckIfArraySorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean b=checkAscending(arr,n);
        if(b==true)
            System.out.println("The array is sorted in ascending order.");
        else
            System.out.println("The array is not sorted in ascending order.");
    }
    public static boolean checkAscending(int[] arr,int n){
    int count=0;
        for(int i=0;i<n-1;i++) {
            if (arr[i] <=arr[i + 1]) {
                count++;
            }
        }
        if(count==n-1)
        return true;
        else return false;
    }
}
