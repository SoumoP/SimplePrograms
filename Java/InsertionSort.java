package com.company;

import java.util.Arrays;

public class InsertionSort 
{
    public static void main(String[] args)
    {
        int[] arr = {5, 3, 4, 1, 2, 0 };
        insert(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void insert(int[] arr)
    {
        for (int i = 0; i < arr.length-1 ; i++) 
        {  //parsing the array till the second last element so that j is not out of bounds
            for (int j = i + 1 ; j > 0 ; j--)
            {    //gets the next number, compares and swaps when necessary
                if(arr[j] < arr[j-1])
                {
                    swapping(arr, j, j-1);
                }
                else
                {
                    break;
                }
            }
        }
    }

    static void swapping(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
