/*
The sum of the squares of the first ten natural numbers is,

12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/

// 03/09/2018: 782300 ns
// 07/25/2018: 515500 ns

class Problem006{
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        System.out.println(squareOfSums(100) - sumOfSquares(100));

        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("total time: "+totalTime);
    }

    static int squareOfSums(int n){
        return (n*(n+1)*n*(n+1))/4;
    }

    static int sumOfSquares(int n){
        return (n)*(n+1)*(2*n+1)/6;
    }
}
