/*

We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n exactly once; for example, the 5-digit number, 15234, is 1 through 5 pandigital.

The product 7254 is unusual, as the identity, 39 × 186 = 7254, containing multiplicand, multiplier, and product is 1 through 9 pandigital.

Find the sum of all products whose multiplicand/multiplier/product identity can be written as a 1 through 9 pandigital.

NOTE: Some products can be obtained in more than one way so be sure to only include it once in your sum.

*/

// 07/08/2018: 275167200 ns

class Problem032{
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        //Code Starts
        boolean[] panList = new boolean[4000000];
        for(int i=0;i<2000;i++) for(int j=0;j<2000;j++) if(isPandigital(i,j)) panList[i*j] = true;
        int sum = 0;
        for(int i=0; i<panList.length; i++) if(panList[i]) sum+=i;
        System.out.println(sum);
        //Code Ends

        long totalTime = System.nanoTime() - startTime;
        System.out.println(totalTime);

    }

    static boolean isPandigital(int a, int b){
        String s = ""+a+b+a*b;
        if(s.length() != 9) return false;
        else{
            boolean[] containsDigits = new boolean[9];
            for(int i=0; i<9; i++) containsDigits[i] = false;
            for(int i=0; i<9; i++){
                if(s.charAt(i) == '0' || containsDigits[s.charAt(i)-49]) return false;
                else containsDigits[s.charAt(i)-49] = true;
            }
            return true;
        }
    }
}
