/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
*/

// 03/09/2018: 4665887000 ns
// 07/26/2018: 34643400 ns


import java.lang.*;

class Problem007{

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        //Start Code
        int primeCounter = 1;
        int numberCounter = 1;

        while(primeCounter < 10001){
            numberCounter += 2;
            if(isPrime(numberCounter)) primeCounter++;
        }

        System.out.println(numberCounter);
        //End Code
        
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("total time: "+totalTime);
    }

    public static boolean isPrime(long num) {
        for (long i=3; i<=Math.sqrt(num); i++) if (num % i == 0) return false;
        return true;
    }

}
