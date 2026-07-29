package javacore.day07;

import java.util.Arrays;

public class ArraysIntoFunctions {
    public static void main(String[] args) {
        int[] arr={1,2,5,4,3};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0]=99;
    }
}
