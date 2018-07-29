/*

A perfect number is a number for which the sum of its proper divisors is exactly equal to the number. For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.

A number n is called deficient if the sum of its proper divisors is less than n and it is called abundant if this sum exceeds n.

As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest number that can be written as the sum of two abundant numbers is 24. By mathematical analysis, it can be shown that all integers greater than 28123 can be written as the sum of two abundant numbers. However, this upper limit cannot be reduced any further by analysis even though it is known that the greatest number that cannot be expressed as the sum of two abundant numbers is less than this limit.

Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers

NOTE: I didn't do use any mathematical tricks yet
*/

//07/26/2018: 1348717800 ns

class Problem023{
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        //Code Starts
        boolean[] sumOfAbundants = new boolean[28123];
        for(int i=0;i<28123;i++) sumOfAbundants[i] = false;

        boolean[] isAbundant = new boolean[28123];
        for(int i=1;i<28123;i++){
            if(sum(i) > i) isAbundant[i] = true;
            else isAbundant[i] = false;
        }

        int sum = 0;
        for(int i=1;i<28123;i++){
            for(int j=i;j<28123-i;j++){
                if(isAbundant[i] && isAbundant[j] && !sumOfAbundants[i+j]){
                    sumOfAbundants[i+j] = true;
                    sum += (i+j);
                }
            }
        }

        System.out.println(28123*14061-sum);
        //Code Ends

        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }

    //TODO make this more efficient by only checking up to sqrt of n
    static int sum(int n){
        int sum = 1;
        for(int i=2;i<n;i++) if(n % i == 0) sum += i;
        return sum;
    }

}
