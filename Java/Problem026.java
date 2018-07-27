import java.math.*;

/*

Find the value of d < 1000 for which 1/d contains the longest recurring cycle in its decimal fraction part.

*/

// 07/27/2018: 331703300 ns

class Problem026{
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        //Code Starts
        int maxKey = 0, maxDividend = 0;
        BigDecimal a = new BigDecimal("1");

        //Loop through all numbers
        for(int i=2; i<1000; i++){

            //Get 1/i
            String stringDecimal = "" + a.divide(new BigDecimal(""+i),1000,RoundingMode.UP);

            //Is it continuous
            try{

                String key = stringDecimal.substring(2,6);
                for(int j=6; j<stringDecimal.length(); j++){

                    String testKey = stringDecimal.substring(j,j+4);
                    if(testKey.equals(key)){
                        if(j-2 > maxKey){
                            maxKey = j-2;
                            maxDividend = i;
                        }
                        break;
                    }

                }
            }
            catch(Exception e){}
        }
        System.out.println(maxKey + " " + maxDividend);
        //Code Ends

        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }
}
