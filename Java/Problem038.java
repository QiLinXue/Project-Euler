/*

Take the number 192 and multiply it by each of 1, 2, and 3:

192 × 1 = 192
192 × 2 = 384
192 × 3 = 576
By concatenating each product we get the 1 to 9 pandigital, 192384576. We will call 192384576 the concatenated product of 192 and (1,2,3)

The same can be achieved by starting with 9 and multiplying by 1, 2, 3, 4, and 5, giving the pandigital, 918273645, which is the concatenated product of 9 and (1,2,3,4,5).

What is the largest 1 to 9 pandigital 9-digit number that can be formed as the concatenated product of an integer with (1,2, ... , n) where n > 1?

*/

// 07/29/2018: 156672500 ns

class Problem038{
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        //Start Code
        long lP = 0;
        for(int n = 2; n < 10; n++){
            for(int i = 0; i < 10000; i ++){
                int[] miniProduct = new int[n];
                String s = "";
                for(int j = 1; j < n; j++){
                    miniProduct[j] = i*j;
                    s += (""+miniProduct[j]);
                }
                if(isPandigital(s) && Long.valueOf(s) > lP) lP = Long.valueOf(s);
            }
        }
        System.out.println(lP);
        //End Code

        long totalTime = System.nanoTime() - startTime;
        System.out.println(totalTime);
    }

    static boolean isPandigital(String s){
        if(s.length() != 9) return false;
        else{
            boolean[] containsDigits = new boolean[9];
            for(int i=0; i<9; i++) containsDigits[i] = false;
            for(int i=0; i<9; i++){
                if(s.charAt(i) == '0' || containsDigits[s.charAt(i)-49]) return false;
                else containsDigits[s.charAt(i)-49] = true;
            }
            return true;
        }
    }
}
