import java.math.BigInteger;

/*

Find the last ten digits of the series, 11 + 22 + 33 + ... + 10001000.

*/

// 07/29/2018: 413460500 ns
class Problem048{

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        //Start Code
        BigInteger sum = new BigInteger("0");
        for(int i=1; i< 1000; i++) sum = sum.add(new BigInteger(""+i).pow(i));
        String f = ""+sum;
        System.out.println(f.substring(f.length()-10,f.length()));
        //End Code

        long totalTime = System.nanoTime() - startTime;
        System.out.println(totalTime);
    }
}
