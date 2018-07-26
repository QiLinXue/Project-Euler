/*

What is the value of the first triangle number to have over five hundred divisors?

*/

// 03/09/2018: 4772641000 ns
// 07/26/2018: 192079699 ns

class Problem012{
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        //Start Code
        int triangle = 0;
        for(int i=1; divisors(triangle) <= 500; i++) triangle += i;
        //End Code

        System.out.println(triangle);

        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("total time: "+ totalTime);
    }

    static int divisors(int n){
        int counter = 0;
        for(int i = 1; i*i < n; i++) if(n % i == 0) counter+=2;
        return counter;
    }

}
