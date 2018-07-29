/*

The decimal number, 585 = 10010010012 (binary), is palindromic in both bases.

Find the sum of all numbers, less than one million, which are palindromic in base 10 and base 2.

(Please note that the palindromic number, in either base, may not include leading zeros.)

*/

// 07/28/2018: 169530900 ns

class Problem036{
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        //I'm going to be using the cheaty way
        //Start Code
        int sum = 0;
        for(int i=0; i<1000000; i++) if(isPal(""+i) && isPal(Integer.toBinaryString(i))) sum+=i;
        System.out.println(sum);
        //End Code

        long totalTime = System.nanoTime() - startTime;
        System.out.println(totalTime);
    }

    static boolean isPal(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
