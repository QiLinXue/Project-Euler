/*

The arithmetic sequence, 1487, 4817, 8147, in which each of the terms increases by 3330, is unusual in two ways: (i) each of the three terms are prime, and, (ii) each of the 4-digit numbers are permutations of one another.

There are no arithmetic sequences made up of three 1-, 2-, or 3-digit primes, exhibiting this property, but there is one other 4-digit increasing sequence.

What 12-digit number do you form by concatenating the three terms in this sequence?

*/

// 07/29/2018: 198183200 ns

class Problem049{
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        //Start Code

        //Prime Sieve
        boolean[] prime = new boolean[10001];

        for(int i=0;i<10000;i++) prime[i] = true; //pretend everythings a prime
        for(int p = 4; p <= 10000; p+=2) prime[p] = false; //even numbers aren't primes
        for(int p = 3; p*p <= 10000; p+=2){
            //Multiples of a prime aren't primes
            if(prime[p]) for(int i = p*2; i <= 10000; i += p)prime[i] = false;
        }

        //Do the actual checking
        for(int a = 1000; a < 10000; a++){
            if(!prime[a]) continue; //If it's not a prime, continue
            if(a == 1487) continue; //If it's the example case, continue
            for(int b = a + 1; b < 10000; b++){
                //If it's a prime, or if it's not a permutation of a, continue
                if(!prime[b] || product(a) != product(b)) continue;

                int c = 2*b-a;
                if(c > 10000 || !prime[c]) continue; //If c is too big or a prime, continue
                if(product(c) == product(b)) System.out.println(""+a+b+c);
            }
        }
        //End Code

        long totalTime = System.nanoTime() - startTime;
        System.out.println(totalTime);
    }

    static int product(int n){
        String s = ""+n;
        return (int)s.charAt(0)*s.charAt(1)*s.charAt(2)*s.charAt(3);
    }
}
