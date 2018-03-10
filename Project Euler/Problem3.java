/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
*/

class Problem3 {
    
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        long x = 600851475143L;
        for (long z = 2L; z*z <= x; z++) {
            if (x%z == 0 && AllMethods.isPrime(z)) {
                System.out.println(z);
            }
        }

        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("total time: "+totalTime);
    }



}
