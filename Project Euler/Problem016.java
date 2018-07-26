/*

What is the sum of the digits of 2^1000

*/

//07/26/2018: 41471500 ns

import java.math.BigInteger;
class Problem016{
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        //Start Code
        System.out.println(sum(new BigInteger("2").pow(1000)));
        //End Code

        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }

    static int sum(BigInteger n){
        String sN = ""+n;
        int sum = 0;
        for(int i=0; i<sN.length(); i++) sum += Integer.parseInt(sN.substring(i,i+1));
        return sum;
    }
}
