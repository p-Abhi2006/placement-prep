package DSA.day05;
import java.util.Scanner;
public class FindNumbersWithEvenNumberOfDigits {
    public static int findNumbers(int[] nums) {
        int number = 0;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            int temp = nums[i];

            while (temp > 0) {
                count++;
                temp = temp / 10;
            }

            if (count % 2 == 0) {
                number++;
            }
        }

        return number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = findNumbers(nums);

        System.out.println("Numbers with even number of digits: " + result);

        sc.close();
    }
}

