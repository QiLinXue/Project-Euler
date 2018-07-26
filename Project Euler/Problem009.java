/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
*/

class Problem009{
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        outerloop:
        for(int i=1;i<1000;i++){
            for(int j=1;j<1000;j++){
                for(int h=1;h<1000;h++){
                    if((i*i)+(j*j)==(h*h) && i+j+h == 1000){
                        System.out.println(i*j*h);
                        break outerloop;
                    }
                }
            }
        }
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("total time: "+totalTime);
    }
}
