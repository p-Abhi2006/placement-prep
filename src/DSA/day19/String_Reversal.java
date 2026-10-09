package DSA.day19;

import java.util.Scanner;

public class String_Reversal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        char[] r = new char[s.length()];

        int j = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            r[j] = s.charAt(i);
            j++;
        }

        System.out.println("Reversed string: " + r);
    }
}