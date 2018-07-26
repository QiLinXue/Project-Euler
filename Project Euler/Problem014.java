/*

Which starting number, under one million, produces the longest chain using the rules from the Collatz Conjecture?

*/

// 2018/07/26: 371674600 ns
class Problem014{
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        //Start Code
        int largestChain = 1, maxNum=0, sampleChain = 1;
        for(int i=2;i<1000000;i++){
            sampleChain = collatzLength(i);
            if(sampleChain > largestChain){
                    largestChain = sampleChain;
                    maxNum = i;
            }
        }
        System.out.println(maxNum);
        //End Code

        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }

    static int collatzLength(long n){
        int i = 1;
        while(n != 1){
            if(n % 2 == 0) n /= 2;
            else n = 3*n+1;
            i++;
        }
        return i;
    }
}
