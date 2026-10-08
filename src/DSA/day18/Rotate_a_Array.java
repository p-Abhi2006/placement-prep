package DSA.day18;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate_a_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k=2;
        int left = 0;
        for (int i = left; i <k; i++) {
            for (int j = left; j < arr.length-1; j++) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}