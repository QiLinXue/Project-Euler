/*

The fraction 49/98 is a curious fraction, as an inexperienced mathematician in attempting to simplify it may incorrectly believe that 49/98 = 4/8, which is correct, is obtained by cancelling the 9s.

We shall consider fractions like, 30/50 = 3/5, to be trivial examples.

There are exactly four non-trivial examples of this type of fraction, less than one in value, and containing two digits in the numerator and denominator.

If the product of these four fractions is given in its lowest common terms, find the value of the denominator.

*/

// 07/28/2018: 58128400 ns

class Problem033{

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        //Code Starts
        float nProduct = 1, dProduct = 1;
        for(float i = 10; i < 100; i++){
            for(float j = i+1; j < 100; j++){
                if(isCurious(i,j)){
                    nProduct *= i;
                    dProduct *= j;
                    System.out.println(i + " " + j);
                }
            }
        }
        System.out.println(asFraction(nProduct, dProduct));
        //Code Ends

        long totalTime = System.nanoTime() - startTime;
        System.out.println(totalTime);
    }

    static boolean isCurious(float a, float b){
        float a1 = (float)Math.floor(a/10);
        float a2 = a % 10;
        float b1 = (float)Math.floor(b/10);
        float b2 = b % 10;

        if(a2 == b1 && a/b == a1/b2) return true;
        else return false;
    }

    public static float gcm(float a, float b) {
        return b == 0 ? a : gcm(b, a % b);
    }

    public static String asFraction(float a, float b) {
        float gcm = gcm(a, b);
        return (a / gcm) + "/" + (b / gcm);
    }

}
