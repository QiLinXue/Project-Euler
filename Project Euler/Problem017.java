/*

If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used? NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.

*/

// 07/26/2018: 3537000 ns

class Problem017{
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        int sum = 11; //1000 inclusive
        for(int i=1;i<1000;i++) sum += wordLength(i);
        System.out.println(sum);

        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }

    static int wordLength(int n){
        String sN = Integer.toString(n);
        int sum = 0;
        int length = sN.length();

        int test;

        //Hundreds Digit
        if(n > 99){
            test = Integer.parseInt(sN.substring(0,1));

            if(test == 1 || test == 2 || test == 6) sum += 3;
            else if(test == 4 || test == 5 || test == 9) sum += 4;
            else if(test == 3 || test == 7 || test == 8) sum += 5;

            sum += 7; //add "hundred" (7 letters)

            if(n % 100 != 0) sum+= 3; //add "and"
        }

        //If at least a two digit number
        if(n > 9){
            test = Integer.parseInt(sN.substring(length-2,length-1));
            if(test > 1){

                if(test == 4 || test == 5 || test == 6) sum += 5;
                if(test == 2 || test == 3 || test == 8 || test == 9) sum += 6;
                if(test == 7) sum += 7;

                test = Integer.parseInt(sN.substring(length-1,length));

                if(test == 1 || test == 2 || test == 6) sum += 3;
                else if(test == 4 || test == 5 || test == 9) sum += 4;
                else if(test == 3 || test == 7 || test == 8) sum += 5;

            }

            else if(test == 1){
                test = Integer.parseInt(sN.substring(length-1,length));

                if(test == 0) sum += 3;
                if(test == 1 || test == 2) sum += 6;
                if(test == 5 || test == 6) sum += 7;
                if(test == 3 || test == 4 || test == 8 || test == 9) sum += 8;
                if(test == 7) sum += 9;
            }

            else if(test == 0){
                test = Integer.parseInt(sN.substring(length-1,length));

                if(test == 1 || test == 2 || test == 6) sum += 3;
                else if(test == 4 || test == 5 || test == 9) sum += 4;
                else if(test == 3 || test == 7 || test == 8) sum += 5;
            }
        }

        // If ONLY a one digit number
        else{
            test = Integer.parseInt(sN.substring(length-1,length));

            if(test == 1 || test == 2 || test == 6) sum += 3;
            else if(test == 4 || test == 5 || test == 9) sum += 4;
            else if(test == 3 || test == 7 || test == 8) sum += 5;
        }

        return sum;
    }
}
