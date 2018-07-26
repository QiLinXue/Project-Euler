/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/

class Problem004{
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        //Very inefficient
        int largestPalindrome = 0;
        for(int i=100;i<10000;i++){
            for(int j=i;j<10000;j++){
                if(isPalindrome(i*j) && (i*j)>largestPalindrome){
                    largestPalindrome = i*j;
                    System.out.println(largestPalindrome);
                }
            }
        }
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("total time: "+totalTime);
    }

    public static boolean isPalindrome(int x) {
           if (x<0 || (x!=0 && x%10==0)) return false;
               int rev = 0;
               while (x>rev){
                      rev = rev*10 + x%10;
                         x = x/10;
               }
           return (x==rev || x==rev/10);
    }


}
