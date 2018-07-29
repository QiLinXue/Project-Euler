/*

An irrational decimal fraction is created by concatenating the positive integers:

0.123456789101112131415161718192021...

It can be seen that the 12th digit of the fractional part is 1.

If dn represents the nth digit of the fractional part, find the value of the following expression.

d1 × d10 × d100 × d1000 × d10000 × d100000 × d1000000

*/

// 07/29/2018: 11710232200 ns

class Problem040{
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        //Start Code
        String s = "";
        int n = 1, product = 1;
        while(s.length() < 1000005){
            s += (""+n);
            n++;
        }
        for(int i=1; i<=1000000; i*= 10) product*= (s.charAt(i-1)-48);
        System.out.println(product);
        //End Code

        long totalTime = System.nanoTime() - startTime;
        System.out.println(totalTime);
    }
}
