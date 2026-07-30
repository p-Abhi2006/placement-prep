package DSA.day03;

import java.util.Scanner;

public class ThirdMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max,sec_max,third_max,count=0;
        max=arr[0];
        sec_max = Integer.MIN_VALUE;
        third_max=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                third_max=sec_max;
                sec_max=max;
                max=arr[i];
            } else if (arr[i]<max && arr[i]>sec_max){
                third_max = sec_max;
                sec_max = arr[i];
            }
            else if(arr[i]<max && arr[i]<sec_max && arr[i]>third_max) {
                count=1;
                third_max = arr[i];
            }
            else continue;}

        if(count==0){
            System.out.println("There is no third maimum element");
            System.out.println("Maximum="+ max);
        }
        else
        System.out.println(third_max);
        }
    }
