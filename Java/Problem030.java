//import java.math;

/*

Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.

NOTE Not a real solution, because I guessed the upper bounds. Didn't bother to do the math
*/

// 07/27/2018: 529309900 ns
class Problem030{
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        //Code Starts
        int sum = 0;

        for(int i = 10; i < 1000000; i++){

            int[] digits = new int[(""+i).length()];
            int minisum = 0;

            for(int j=0; j<digits.length; j++){
                digits[j] = Integer.valueOf((""+i).substring(j,j+1));
                digits[j] = (int)Math.pow(digits[j],5);
                minisum += digits[j];
            }

            if(minisum == i) sum += i;
        }

        System.out.println(sum);
        //Code Ends

        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }
}
