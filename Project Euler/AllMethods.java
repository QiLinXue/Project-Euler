class AllMethods{
    public static boolean isPrime(long num) {
        for (long i=2; i<num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
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

     public static void main(String[] args) {
         long startTime = System.nanoTime();
         System.out.println(isPrime(4643668177711L));
         long endTime   = System.nanoTime();
         long totalTime = endTime - startTime;
         System.out.println("total time: "+totalTime);
     }
}
