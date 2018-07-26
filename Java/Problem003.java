/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
*/

// 03/09/2018: 13761100 ns
// 07/25/2018: 623000 ns

class Problem003 {

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        //Code Starts
        long x = 600851475143L;
        for (long i=2L; i*i<=x; i++) if (x % i == 0) x = x / i;
        System.out.println(x);
        //Code Ends

        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("total time: "+totalTime);
    }

}
