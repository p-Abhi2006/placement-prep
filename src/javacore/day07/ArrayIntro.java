package javacore.day07;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntro {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the roll numbers of students:");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
       for(int i=0;i<n;i++){
           System.out.print("Roll no. of student"+(i+1)+" is:");
         System.out.println(arr[i]);
       }

           System.out.println(Arrays.toString(arr));
        //for each loop
        for(int j:arr){        //for every element,print the element
            System.out.print(j+ " ");//here num represents every element of the array
        }

    }
}
//int[] arr   === this is the declaration odf the array,it occurs at compile time
//new int[n]; ===this is the initialisation of the array,it occurs at the runtime
//array objects are in heap
//heap objects are not continuous
//so array objects may not be continuous,it depends on the jvm
//for all int arrays,the default value is 0
//for all string arrays,the default value is null
//null is a special literal in java,its not a datatype.
//