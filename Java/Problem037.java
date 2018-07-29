/*

The number 3797 has an interesting property. Being prime itself, it is possible to continuously remove digits from left to right, and remain prime at each stage: 3797, 797, 97, and 7. Similarly we can work from right to left: 3797, 379, 37, and 3.

Find the sum of the only eleven primes that are both truncatable from left to right and right to left.

NOTE: 2, 3, 5, and 7 are not considered to be truncatable primes.

*/

// 07/29/2018: 599796800 ns

class Problem037{
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        //Start Code
        int sum = 0, counter = 0, i = 10;
        while(counter != 11){
            if(truncatablePrime(i)){
                sum+=i;
                counter++;
            }
            i++;
        }

        System.out.println(sum  );
        //End Code

        long totalTime = System.nanoTime() - startTime;
        System.out.println(totalTime);
    }

    static boolean isPrime(String s) {
        int num = Integer.valueOf(s);
        if(num == 0 || num == 1) return false;
        for (int i=2; i<=Math.sqrt(num); i++) if (num % i == 0) return false;
        return true;
    }

    static boolean truncatablePrime(long num){
        String s = ""+num;
        for(int i = 0; i < s.length(); i ++){
            if(!isPrime(s.substring(i,s.length()))) return false;
            if(!isPrime(s.substring(0,s.length()-i))) return false;
        }
        return true;
    }

}
