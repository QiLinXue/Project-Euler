/*

We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n exactly once. For example, 2143 is a 4-digit pandigital and is also prime.

What is the largest n-digit pandigital prime that exists?

*/

// 07/29/2018: 467046600 ns

class Problem041{

    static int digits = 7;
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        //Start Code
        //Prime Sieve
        boolean[] prime = new boolean[10000000+1];
        for(int i=0;i<10000000;i++) prime[i] = true;
        for(int p = 2; p <= 10000000; p+=2) prime[p] = false;
        for(int p = 3; p*p <= 10000000; p+=2){
            if(prime[p]) for(int i = p*2; i <= 10000000; i += p) prime[i] = false;
        }

        //Search
        int l = 0;
        for(int z = 3; z<= 7; z++){
            digits = z;

            int upperLimit = (int)Math.pow(10,digits);
            int lowerLimit = (int)Math.pow(10,digits-1);

            for(int i=lowerLimit;i<upperLimit;i++) if(isPandigital(i) && prime[i] && i>l) l = i;

        }
        System.out.println(l);
        //End Code

        long totalTime = System.nanoTime() - startTime;
        System.out.println(totalTime);
    }

    static boolean isPandigital(int n){
        String s = ""+n;
        if(s.length() != digits) return false;
        else{
            boolean[] containsDigits = new boolean[digits];
            for(int i=0; i<digits; i++) containsDigits[i] = false;
            for(int i=0; i<digits; i++){
                if(s.charAt(i) == '0' || s.charAt(i) > digits+48) return false;
                if(containsDigits[s.charAt(i)-49]) return false;
                else containsDigits[s.charAt(i)-49] = true;
            }
            return true;
        }
    }

}
