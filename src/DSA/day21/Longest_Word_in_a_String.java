package DSA.day20;

import java.util.Scanner;

public class Longest_Word_in_a_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        //System.out.print(s);
        int temp=0,maxlength=0,cur_length=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
cur_length=0;
            }
           else  cur_length++;
if(cur_length>maxlength){maxlength=cur_length; temp=i-cur_length+1;}
        }
        for(int i=temp;i<s.length()&&s.charAt(i)!=' ';i++){
            System.out.print(s.charAt(i));
        }
    }
}
