import java.math.BigInteger;

/*

What is the index of the first term in the Fibonacci sequence to contain 1000 digits?

*/

// 08/26/2018: 325625300 ns
class Problem025{
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        //Start Code
        BigInteger x1 = new BigInteger("1"), x2 = new BigInteger("1");
        int i=2;
        while(x2.toString().length() < 1000){
            x2 = x2.add(x1);
            x1 = x2.subtract(x1);
            i++;
        }
        System.out.println(i);
        //End Code

        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }
}
