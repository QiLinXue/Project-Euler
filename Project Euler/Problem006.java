/*
The sum of the squares of the first ten natural numbers is,

12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/

class Problem006{
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        System.out.println(squareSumNumbers()-sumSquareNumbers());

        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("total time: "+totalTime);
    }

    static int sumSquareNumbers(){
        int summation = 0;
        for(int i=1;i<=100;i++){
            summation = summation + (i*i);
        }
        return summation;
    }

    static int squareSumNumbers(){
        int minisum = 0;
        for(int i=1;i<=100;i++){
            minisum = minisum + i;
        }
        return (minisum*minisum);

    }
}
