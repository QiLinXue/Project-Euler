/*

The prime 41, can be written as the sum of six consecutive primes:

41 = 2 + 3 + 5 + 7 + 11 + 13
This is the longest sum of consecutive primes that adds to a prime below one-hundred.

The longest sum of consecutive primes below one-thousand that adds to a prime, contains 21 terms, and is equal to 953.

Which prime, below one-million, can be written as the sum of the most consecutive primes?

*/

// 07/29/2018: 41407700 ns

class Problem050{
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        //Code Starts
        //Prime Sieve
        int size =  1000000;
        boolean[] prime = new boolean[size+1];

        for(int i=0;i<size;i++) prime[i] = true; //pretend everythings a prime
        for(int p = 4; p <= size; p+=2) prime[p] = false; //even numbers aren't primes
        for(int p = 3; p*p <= size; p+=2){
            //Multiples of a prime aren't primes
            if(prime[p]) for(int i = p*2; i <= size; i += p)prime[i] = false;
        }

        //Loop through starting primes and length of sequence
        int largestSumCounter = 0, largestSum = 0;
        for(int i = 2; i < size; i++){
            int miniSumCounter = 1, miniSum = i;
            if(!prime[i] || miniSum >= size) continue; //If not a prime or sum too big, continue

            for(int j = 1; j < size; j++){
                if(i + j > size || !prime[i+j]) continue;

                miniSumCounter ++;
                miniSum += i+j;

                if(miniSum > size) break; //If it's too big, continue

                if(prime[miniSum] && miniSumCounter > largestSumCounter){
                    largestSumCounter = miniSumCounter;
                    largestSum = miniSum;
                }

            }

        }
        System.out.println(largestSum);
        //End Code

        long totalTime = System.nanoTime() - startTime;
        System.out.println(totalTime);
    }
}
