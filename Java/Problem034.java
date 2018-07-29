/*

145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.

Find the sum of all numbers which are equal to the sum of the factorial of their digits.

Note: as 1! = 1 and 2! = 2 are not sums they are not included.

*/

// 07/28/2018: 151598500 ns

class Problem034{
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        //Code Starts
        int sum = 0;
        for(int i = 10; i < 1000000; i++) if(factorialProduct(i) == i) sum+= i;
        System.out.println(sum);
        //Code Ends

        long totalTime = System.nanoTime() - startTime;
        System.out.println(totalTime);
    }

    static int f(int n){
        int product = 1;
        for(int i=2;i<=n;i++) product*=i;
        return product;
    }

    static int factorialProduct(int n){
        int sum = 0;
        String s = ""+n;
        for(int i=0; i<s.length(); i++) sum+=(f(s.charAt(i)-48));
        return sum;
    }
}
