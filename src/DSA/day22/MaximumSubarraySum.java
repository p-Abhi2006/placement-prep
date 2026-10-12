
package DSA.day22;

import java.util.Scanner;

public class MaximumSubarraySum {
    public static int maxSubarraySum(int[] arr) {
        int currentSum = arr[0];
        int maxSum = arr[0];
        for (int i=1; i<arr.length;i++) {
            currentSum = Math.max(
                    arr[i],
                    currentSum + arr[i]
            );
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
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
        System.out.println("Maximum Subarray Sum: "
                + maxSubarraySum(nums));
        sc.close();
    }
}
