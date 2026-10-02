package DSA.day16;

import java.util.Arrays;
import java.util.Scanner;

public class Move_zero {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int [] arr=new int[10];
            int j=0;
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=0)
                {
                    arr[j]=arr[i];
                    j++;
                }
            }
            int i=j;
            while(i<arr.length){
                arr[i]=0;
                i++;
            }
            System.out.print(Arrays.toString(arr));
        }
    }


