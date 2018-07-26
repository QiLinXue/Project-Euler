import java.math.BigInteger;

/*

Find the sum of the digits in the number 100!

*/

// 07/26/2018: 58392700 ns

class Problem020{
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        //Code Starts
        BigInteger factorial = new BigInteger("1");
        for(int i=100;i>1;i--) factorial = factorial.multiply(new BigInteger(Integer.toString(i)));
        System.out.println(sum(factorial));
        //Code Ends

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
