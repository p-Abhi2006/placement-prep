package DSA.day01;

public class Twosum {

    public static int[] twoSum(int[] nums, int target) {

        int n = nums.length;
        int[] res = new int[2];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] ans = twoSum(nums, target);

        System.out.println(ans[0] + " " + ans[1]);
    }
}