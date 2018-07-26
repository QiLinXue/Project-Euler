/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
*/

// 03/09/2018: 202054299 ns
// 07/26/2018: 979200 ns

class Problem009{
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        //Start Code
        int c;
        outerloop:
        for(int a=0;a<1000;a+=2){
            for(int b=1;b<1000;b+=2){
                c = 1000-a-b;
                if((a*a)+(b*b)==(c*c)){
                    System.out.println(a*b*c);
                    break outerloop;
                }
            }
        }
        //End Code
        
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("total time: "+totalTime);
    }
}
