/*

Starting with the number 1 and moving to the right in a clockwise direction a 5 by 5 spiral is formed as follows:

21 22 23 24 25
20  7  8  9 10
19  6  1  2 11
18  5  4  3 12
17 16 15 14 13

It can be verified that the sum of the numbers on the diagonals is 101.

What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral formed in the same way?

*/

// 07/27/2018: 31790600 ns

class Problem028{
    public static int[][] grid = new int[1001][1001];

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        //Start Code
        fill(grid);
        System.out.println(diagonalSum(grid));
        //End Code

        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }

    static void fill(int[][] g){

        //Fill it up with zeros
        for(int i=0;i<g.length;i++) for(int j=0;j<g.length;j++) g[i][j]=0;

        //Fill the path
        int c = (g.length-1)/2;

        boolean right = true, down = false, left = false, up = false;
        int x = 0, y = 0;
        for(int i=1;i<=grid.length*grid.length;i++){

            g[c+x][c+y] = i;

            //Cases (shifts x and y)
            if(right){
                if(g[c+x+1][c+y] == 0){
                    x++;
                    right = false;
                    down = true;
                }
                else y--;
            }

            else if(down){
                if(g[c+x][c+y+1] == 0){
                    y++;
                    down = false;
                    left = true;
                }
                else x++;
            }

            else if(left){
                if(g[c+x-1][c+y] == 0){
                    x--;
                    left = false;
                    up = true;
                }
                else y++;
            }

            else if(up){
                if(g[c+x][c+y-1] == 0){
                    y--;
                    up = false;
                    right = true;
                }
                else x--;
            }
        }
    }

    static int diagonalSum(int[][] g){
        int sum = -1;
        for(int i=0;i<g.length;i++) sum += g[i][i] + g[i][g.length-i-1];
        return sum;
    }


}
