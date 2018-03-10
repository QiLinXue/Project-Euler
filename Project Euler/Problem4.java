/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/

class Problem4{
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        //int testNumber = Integer.parseInt(System.console().readLine());
        //System.out.println(isPalindrome(testNumber));

        //Very inefficient
        int largestPalindrome = 0;
        for(int i=100;i<10000;i++){
            for(int j=i;j<10000;j++){
                if(AllMethods.isPalindrome(i*j) && (i*j)>largestPalindrome){
                    largestPalindrome = i*j;
                    System.out.println(largestPalindrome);
                }
            }
        }
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("total time: "+totalTime);
    }
    /*
    //Algorithm 1
    static boolean isPalindrome(int testInteger){
        String testString = Integer.toString(testInteger);
        for(int i = 0; i<testString.length()/2; i++){
            if(testString.charAt(i) != testString.charAt(testString.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    */

    //Algorithm 2
}
