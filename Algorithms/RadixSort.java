/**
 ** Java Program to Implement Radix Sort
 **/

import java.util.Scanner;

/** Class RadixSort **/
public class RadixSort
{

    public static void sort(int[] a)
    {
        int m = a[0], exp = 1, n = a.length;
        int[] b = new int[10];
        for (int i = 1; i < n; i++)
            if (a[i] > m)
                m = a[i];
        while (m / exp > 0)
        {
            int[] bucket = new int[10];

            for (i = 0; i < n; i++)
                bucket[(a[i] / exp) % 10]++;
            for (i = 1; i < 10; i++)
                bucket[i] += bucket[i - 1];
            for (i = n - 1; i >= 0; i--)
                b[--bucket[(a[i] / exp) % 10]] = a[i];
            for (i = 0; i < n; i++)
                a[i] = b[i];
            exp *= 10;
        }
    }
    /** Main method **/
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,6,3,2};
        sort(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
