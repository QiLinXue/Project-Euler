import java.util.Random;

public class KthLargestElement{
    public static void sort(int k,int[]sequence)
    {
        int i, j, temp;
        for (i = 1; i< sequence.length; i++)
        {
            j = i;
            temp = sequence[i];
            while (j > 0 && temp < sequence[j-1])
            {
                sequence[j] = sequence[j-1];
                j = j-1;
            }
            sequence[j] = temp;
        }
    }

    public static void main(String args[])
    {
        int k = 3;
        int[] sequence = {1,2,3,4,5,6,7,8,9,10,13,15,19};
        sort(k,sequence);
        System.out.println(k+"th largest element is " + sequence[sequence.length-k-1]);
    }
}
