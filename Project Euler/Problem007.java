/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
*/

class Problem7{

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        int primeCounter = 1; //1 because it includes 2
        int numberCounter = 1;

        while(primeCounter < 10001){
            numberCounter+=2;

            if(AllMethods.isPrime(numberCounter)){
                primeCounter++;
            }
        }

        System.out.println(numberCounter);

        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("total time: "+totalTime);
    }

}
