
package DSA.day22;

import java.util.Scanner;

    public class MissingNumber {
        public static int findMissingNumber(int[] arr) {
            int n = arr.length;
            int expectedSum = n*(n+1)/2;
            int actualSum = 0;
            for (int num : arr) {
                actualSum += num;
            }
            return expectedSum - actualSum;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter array size: ");
            int size = sc.nextInt();
            int[] nums = new int[size];
            System.out.println("Enter " + size + " numbers:");
            for (int i = 0; i < nums.length; i++) {
                nums[i] = sc.nextInt();
            }
            System.out.println("Missing number: " + findMissingNumber(nums));
            sc.close();
        }
    }


