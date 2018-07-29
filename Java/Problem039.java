/*

If p is the perimeter of a right angle triangle with integral length sides, {a,b,c}, there are exactly three solutions for p = 120.

{20,48,52}, {24,45,51}, {30,40,50}

For which value of p ≤ 1000, is the number of solutions maximised?

*/

// 08/29/2018: 227465900 ns

class Problem039{
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        //Start Code
        int maxCounter = 0, highestP = 0;
        for(int p = 10; p<= 1000; p++){
            int miniCounter = 0;

            for(int a = 1; a <= p-3; a++){
                for(int b = a + 1; b < p-2; b++){
                    int c = p-a-b;
                    if(a*a + b*b == c*c) miniCounter ++;
                }
            }

            if(miniCounter > maxCounter){
                maxCounter = miniCounter;
                highestP = p;
            }

        }
        System.out.println(highestP);
        //End Code

        long totalTime = System.nanoTime() - startTime;
        System.out.println(totalTime);
    }
}
