/*

The number, 197, is called a circular prime because all rotations of the digits: 197, 971, and 719, are themselves prime.

There are thirteen such primes below 100: 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, and 97.

How many circular primes are there below one million?

*/

// 07/28/2018: 244918400 ns

class Problem035{
    static boolean[] p = new boolean[1000000];

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        //Code Starts
        for(int i=0; i<p.length;i++) p[i] = true;
        for(int i=3; i*i < p.length; i+=2){
            if(p[i]) for(int j=i*2; j < p.length; j+=i) p[j] = false;
        }
        int counter = 0;
        for(int i=2;i<1000000;i++) if(isCircularPrime(i)) counter++;
        System.out.println(counter);
        //Code Ends

        long totalTime = System.nanoTime() - startTime;
        System.out.println(totalTime);
    }

    static boolean isCircularPrime(int n){
        String s = ""+n;
        String[] rotations = new String[s.length()];
        if(n == 2) return true;
        for(int i=0; i<rotations.length; i++){
            rotations[i] = s.substring(i,s.length()) + s.substring(0,i);
            int index = Integer.valueOf(rotations[i]);
            if(!p[index] || index % 2 == 0) return false;
        }
        return true;
    }
}
