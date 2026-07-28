package DSA.day02;


    import java.util.Scanner;
import java.util.Arrays;

    public class GetConcatenation {

        public int[] getConcatenation(int[] nums) {
            int n = nums.length;
            int i;
            int[] ans = new int[2 * n];

            for (i = 0; i < n; i++) {
                ans[i] = nums[i];
            }

            for (int j = 0; j < n; j++) {
                ans[i] = nums[j];
                i++;
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

            GetConcatenation obj = new GetConcatenation();

            int[] result = obj.getConcatenation(nums);

            System.out.println("Concatenated array: " + Arrays.toString(result));

            sc.close();
        }
    }

