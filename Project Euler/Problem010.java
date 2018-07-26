/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
*/

// 03/09/2018: 29497700 ns
// 07/26/2018: 22318500 ns
class Problem010{

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        //Start Code
        sieveOfEratosthenes(2000000);
        //End Code

        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("total time: "+totalTime);
    }

    static void sieveOfEratosthenes(int n){
        long primeSum = 2L;
        boolean prime[] = new boolean[n+1];

        for(int i=0;i<n;i++) prime[i] = true;
        for(int p = 3; p*p <= n; p+=2) if(prime[p]) for(int i = p*2; i <= n; i += p) prime[i] = false;
        for(int i = 3; i <= n; i+=2) if(prime[i]) primeSum+=i;

        System.out.println(primeSum);
    }
}
