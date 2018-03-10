/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
*/

class Problem1{
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        int x = 1;
        int sum = 0;
        while(x<1000){
            if(x % 3 == 0 || x % 5 == 0){
                sum = sum + x;
            }
            x++;
        }
        System.out.println(sum);
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("total time: "+totalTime);
    }
}
