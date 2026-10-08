package DSA.day18;

import java.util.HashMap;
import java.util.Scanner;

public class Find_Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        int[] duplicate = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int j = 0;
        for (int num:map.keySet()) {
            if (map.get(num) > 1) {
                duplicate[j] = num;
                j++;
            }
        }
        System.out.println("Duplicates:");

        for (int i =0;i<j;i++) {
            System.out.println(duplicate[i]);
        }
    }
}