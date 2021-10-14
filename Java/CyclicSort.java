package com.company;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        //           0  1  2  3  4
        cycle(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cycle(int[] arr) {
        int index = 0;
        //start from the first index and check if the index and the value are matching or not
        //value = index - 1
        while(index < arr.length){
            int value = arr[index] - 1;
            if(arr[index] != arr[value]){
                swapping(arr, index, value);
            }
            else{
                index++;
            }
        }
    }

    static void swapping(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
