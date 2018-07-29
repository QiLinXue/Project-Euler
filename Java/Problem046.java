/*

It was proposed by Christian Goldbach that every odd composite number can be written as the sum of a prime and twice a square.

9 = 7 + 2×12
15 = 7 + 2×22
21 = 3 + 2×32
25 = 7 + 2×32
27 = 19 + 2×22
33 = 31 + 2×12

It turns out that the conjecture was false.

What is the smallest odd composite that cannot be written as the sum of a prime and twice a square?

*/

// 07/29/2018: 2423900 ns

class Problem046{
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        //Code Starts
        int testSize = 10000;

        //Prime Sieve
        boolean[] prime = new boolean[testSize+1];
        for(int i=0;i<testSize;i++) prime[i] = true;
        for(int p = 2; p <= testSize; p+=2) prime[p] = false;
        for(int p = 3; p*p <= testSize; p+=2){
            if(prime[p]) for(int i = p*2; i <= testSize; i += p) prime[i] = false;
        }

        //Create Boolean List to see if there are exceptions to conjecture
        boolean[] numList = new boolean[testSize+1];
        for(int i = 0; i < testSize; i++) numList[i] = ((i % 2 == 0) ? false : true);
        for(int p = 3; p < testSize; p+=2) if(prime[p]) numList[p] = false;

        // Goldbach Conjecture: odd composite can be represented as a + 2(b^2)
        for(int a = 1; a < testSize; a += 2){
            if(!prime[a]) continue;
            for(int b = 1; b*b < (testSize-a)/2; b++) numList[a+2*b*b] = false;
        }

        //Checks if there are any trues left in array
        for(int i = 2; i < numList.length; i++) if(numList[i]){
            System.out.println(i);
            break;
        }
        //End Code

        long totalTime = System.nanoTime() - startTime;
        System.out.println(totalTime);

    }
}
