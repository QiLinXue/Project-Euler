/*

Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.

For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

Evaluate the sum of all the amicable numbers under 10000.

*/

// 07/26/2018: 243996100 ns

class Problem021{
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        //Start Code
        int sum=0;
        for(int i=1; i<10000; i++) if(isAmicable(i)) sum+=i;
        System.out.println(sum);
        //End Code

        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }

    static boolean isAmicable(int n){
        int sum = 1;
        for(int i=2; i<n; i++) if(n % i == 0) sum+=i;

        int nDivisorSums = sum;
        sum = 1;
        for(int i=2; i<nDivisorSums; i++) if(nDivisorSums % i == 0) sum+=i;

        return n==sum && nDivisorSums!=n;
    }
}
