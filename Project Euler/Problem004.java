/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/

// 03/09/2018: 1035309400 ns
// 07/25/2018: 9144600 ns

class Problem004{
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        //Code Starts
        int largestPalindrome = 0;
        for(int i=999;i>=100;i--){
            for(int j=i;j>=100;j--){
                if(isPalindrome(i*j) && (i*j)>largestPalindrome) largestPalindrome = i*j;
            }
        }
        System.out.println(largestPalindrome);
        //Code Ends

        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("total time: "+totalTime);
    }

    //Palindrome Tester
    public static boolean isPalindrome(int x) {
           if (x % 10 == 0) return false;
           int rev = 0;
           while (x > rev){
               rev = rev*10 + x % 10;
               x = x/10;
           }
           return (x==rev || x==rev/10);
    }


}
