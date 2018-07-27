/*

Considering quadratics of the form:

n^2+an+b, where |a|<1000 and |b|≤1000

Find the product of the coefficients, a and b, for the quadratic expression that produces the maximum number of primes for consecutive values of n, starting with n=0.

*/

// 07/27/2018: 285638500 ns

class Problem027{
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        //Start Code
        int maxProduct = 0, maxPrimes = 0;
        for(int a=-999;a<1000;a++){
            for(int b=-1000;b<=1000;b++){
                int n = numberOfPrimes(a,b);
                if(n > maxPrimes){
                    maxPrimes = n;
                    maxProduct = a*b;
                }
            }
        }
        System.out.println(maxProduct);
        //End Code

        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }

    static int numberOfPrimes(int a, int b){
        boolean prime = true;
        int n=0;
        while(prime){
            int num = n*n+a*n+b;
            if(num <= 0) prime = false;
            else for (int i=2; i*i<=num; i++) if (num % i == 0) prime = false;
            n++;
        }
        return n-1;
    }
}
