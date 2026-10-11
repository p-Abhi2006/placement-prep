package DSA.day21;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Remove_Dup_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        int j=0;
        char [] duplicate=new char[s.length()];
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0;i<s.length();i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for (char ch:map.keySet()){
            if(map.get(ch)>1){
                duplicate[j] =ch;
                j++;
            }
        }
        System.out.println("Duplicates:");
        for (int i = 0; i < j; i++) {
            System.out.print(duplicate[i] + " ");
        }
    }
}