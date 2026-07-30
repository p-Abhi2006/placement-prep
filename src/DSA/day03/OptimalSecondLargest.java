package DSA.day03;

import java.util.Scanner;

public class OptimalSecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max,sec_max;
        max=arr[0];
        sec_max = Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            if(arr[i]>max ){
                sec_max = max;
                max = arr[i];
            }
            else if(arr[i]<max && arr[i]>sec_max)
                sec_max=arr[i];
            else
                continue;
        }
        System.out.println(sec_max);
    }
}
