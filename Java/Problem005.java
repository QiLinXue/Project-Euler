/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

// 03/09/2018: 509906300 ns
// 07/25/2018: 553200 ns
class Problem005{
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        //Start Code
        int largestMultiple = 20;
        for(int i=19;i>=2;i--) largestMultiple = lcm(largestMultiple,i);
        System.out.println(largestMultiple);
        //End Code
        
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("total time: "+totalTime);
    }

    static int lcm(int a, int b){
        int n=2;
        int original = a;
        while(n <= b){
            if(a % n == 0 && b % n ==0){
                b /= n;
                a /= n;
                n = 2;
            }
            else n++;
        }
        return original*b;
    }
}
