package DSA.day02;

    import java.util.Scanner;
    public class MaxConsecutiveOnes {

        public int findMaxConsecutiveOnes(int[] nums) {
            int n = nums.length;
            int count = 0, max = 0;

            for (int i = 0; i < n; i++) {
                if (nums[i] == 1)
                    count++;

                if (count > max)
                    max = count;

                if (nums[i] == 0)
                    count = 0;
            }

            return max;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();

            int[] nums = new int[n];

            System.out.println("Enter the array elements (0 or 1):");
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            MaxConsecutiveOnes obj = new MaxConsecutiveOnes();
            int result = obj.findMaxConsecutiveOnes(nums);

            System.out.println("Maximum consecutive ones = " + result);

            sc.close();
        }
    }

