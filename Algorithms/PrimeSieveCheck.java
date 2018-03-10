import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class PrimeSieveCheck{
    static boolean sieveOfEratosthenes(int target){
        int n = target+1;
		// Create a boolean array "prime[0..n]" and initialize
		// all entries it as true. A value in prime[i] will
		// finally be false if i is Not a prime, else true.
		boolean prime[] = new boolean[n];
		for(int i=0;i<n;i++)
			prime[i] = true;

		for(int p = 2; p*p <=n; p++)
		{
			// If prime[p] is not changed, then it is a prime
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
			if(prime[i] == true && i == target){
                return true;
            }
		}
        return false;
	}

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        System.out.println(sieveOfEratosthenes(37));

        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("total time: "+totalTime);
    }
}
