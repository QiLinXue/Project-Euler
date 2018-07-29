/*

The first two consecutive numbers to have two distinct prime factors are:

14 = 2 × 7
15 = 3 × 5

The first three consecutive numbers to have three distinct prime factors are:

644 = 2² × 7 × 23
645 = 3 × 5 × 43
646 = 2 × 17 × 19.

Find the first four consecutive integers to have four distinct prime factors each. What is the first of these numbers?

*/

// 07/29/2018: 3770618000 ns

class Problem047{
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        //Start Code

        //Create a boolean to test for special numbers
        boolean[] hasFour = new boolean[200000];
        for(int i = 0; i < hasFour.length; i++) hasFour[i] = false;

        //Check if every fourth number is false so we don't have to check in between
        for(int i = 0; i < hasFour.length; i+=4) hasFour[i] = hasFourPF(i);
        for(int i = 0; i < hasFour.length; i++){
            if(i % 4 == 0 && !hasFour[i] && !hasFour[i+3]) i += 3;
            else hasFour[i] = hasFourPF(i);
        }

        //Start Counting
        int counter = 0;
        for(int i = 0; i < hasFour.length; i++){
            if(hasFour[i]) counter++;
            else counter = 0;

            if(counter == 4){
                System.out.println(i-3);
                break;
            }
        }
        //End Code

        long totalTime = System.nanoTime() - startTime;
        System.out.println(totalTime);
    }

    static boolean hasFourPF(int n){
        int[] pF = {-1, -1, -1, -1};
        int counter = 0;

        int i =2;
        while(i <= n){

            if(n % i == 0){

                //If not a duplicate
                if(pF[0] != i && pF[1] != i && pF[2] != i && pF[3] != i){
                    if(counter == 4) return false;
                    pF[counter] = i;
                    counter++;
                }

                //Update Details
                n /= i;
                i = 1;

            }

            i++;
        }

        if(pF[3] == -1) return false;
        else return true;

    }
}
