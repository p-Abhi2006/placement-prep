package DSA.day17;

import java.util.Arrays;
import java.util.Scanner;

public class reverse_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[10];
        int j=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int left=0,right=arr.length-1;
        for(int i=left;i<(arr.length)/2;i++, right--){
            int temp=arr[i];
            arr[i]=arr[right];
            arr[right]=temp;
        }
        System.out.print(Arrays.toString(arr));
    }
}
