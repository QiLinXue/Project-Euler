import java.math.BigInteger;

/*

Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner. How many such routes are there through a 20×20 grid?

*/

// 07/26/2018: 538600 ns
// 07/27/2018 (alt method): 568500 ns

class Problem015{
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        // altMethod();

        //Start Code
        long[][] paths = new long[21][21];
        for(int a=0;a<21;a++){
            paths[20][a] = 1;
            paths[a][20] = 1;
        }
        for(int i=19;i>=0;i--) for(int j=19;j>=0;j--) paths[i][j] = paths[i+1][j] + paths[i][j+1];
        System.out.println(paths[0][0]);
        //End Code

        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }

    //Alternative Code using Combinatorics
    static void altMethod(){
        int steps = 40;
        long product = 1;
        for(int i=steps/2+1;i<=steps;i++) product *= (i)/(i-steps/2);
        System.out.println(product);
    }
}
