package com.company;

public class Floor_Of_Number {
    public static void main(String[] args) {

        int[] arr = {2,3,5,9,14,16,18};
        int target = 4;
        int ans = floor(arr,target);
        System.out.println(arr[ans]);
    }

    // Function to calculate floor of a number
    static int floor(int[] arr, int target)
    {
        int start = 0 ;
        int end = arr.length-1;

        while(start<=end)
        {
            int mid = start + (end - start)/2;
            if(target < arr[mid])
            {
                end = mid - 1;
            }
            else if(target > arr[mid])
            {
                start = mid + 1;
            }
            else
            {
                return mid;
            }
        }
        return end;
    }
}
