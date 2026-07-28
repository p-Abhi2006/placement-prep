package DSA.day02;

import java.util.Scanner;
import java.util.Arrays;

public class BuildArray {

    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        BuildArray obj = new BuildArray();

        int[] result = obj.buildArray(nums);

        System.out.println("Output array: " + Arrays.toString(result));

        sc.close();
    }
}