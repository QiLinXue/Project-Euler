/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
*/
class Problem10{

    //Sieve of Eratosthenes
    static void sieveOfEratosthenes(int n){
        long primeSum = 0L;
		boolean prime[] = new boolean[n+1];
		for(int i=0;i<n;i++)
			prime[i] = true;

		for(int p = 2; p*p <=n; p++)
		{
			if(prime[p] == true)
			{
				// Update all multiples of p
				for(int i = p*2; i <= n; i += p)
					prime[i] = false;
			}
		}

		// Print all prime numbers
		for(int i = 2; i <= n; i++)
		{
			if(prime[i] == true){
                primeSum+=i;
            }
		}
        System.out.println(primeSum);
	}

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        sieveOfEratosthenes(2000000);
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("total time: "+totalTime);
    }
}
