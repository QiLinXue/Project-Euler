class Problem015{
    public static void main(String[] args) {
        long startTime = System.nanoTime();

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
}
