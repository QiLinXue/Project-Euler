/**
 ** Java Program to Implement Interpolation Search Algorithm
 **/

import java.util.Scanner;

/** Class InterpolationSearch **/
public class Search{
    /** interpolationSearch function **/
    public static int interpolationSearch(int[] sortedArray, int toFind)
    {
        int low = 0;
        int high = sortedArray.length - 1;
        int mid;
        while (sortedArray[low] <= toFind && sortedArray[high] >= toFind)
        {
            if (sortedArray[high] - sortedArray[low] == 0)
                return (low + high)/2;
            /** out of range is possible  here **/
             mid = low + ((toFind - sortedArray[low]) * (high - low)) / (sortedArray[high] - sortedArray[low]);

             if (sortedArray[mid] < toFind)
                 low = mid + 1;
             else if (sortedArray[mid] > toFind)
                 high = mid - 1;
             else
                 return mid;
        }
        if (sortedArray[low] == toFind)
            return low;
           /** not found **/
        else
            return -1;
    }

    /** Main method **/
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int key = 2;

        int result = interpolationSearch(arr, key);
        System.out.println(result);
        /*Unsorted array*/


    }
}
