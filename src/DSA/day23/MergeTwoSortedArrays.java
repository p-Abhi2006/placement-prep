package DSA.day23;

import java.util.Scanner;
import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i<a.length &&j<b.length) {
            if (a[i] <= b[j]) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }
        while (i<a.length) {
            result[k++] = a[i++];
        }
        while (j<b.length) {
            result[k++] = b[j++];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter sorted elements:");
        for (int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();
        int[] b = new int[m];

        System.out.println("Enter sorted elements:");
        for (int i=0;i<m;i++) {
            b[i] = sc.nextInt();
        }
        int[] result = merge(a, b);
        System.out.println("Merged array: " + Arrays.toString(result));

        sc.close();
    }
}

