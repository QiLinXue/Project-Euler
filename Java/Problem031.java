/*

In England the currency is made up of pound, £, and pence, p, and there are eight coins in general circulation:

1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p).
It is possible to make £2 in the following way:

1×£1 + 1×50p + 2×20p + 1×5p + 1×2p + 3×1p
How many different ways can £2 be made using any number of coins?

NOTE Hey look another combinatorics problem. Guess what I'm going to do with all the combinatorics preperation I'm doing for math competitions? Nothing! bwahahahaha... [eye rape begins]

*/

// 07/27/2018: 9774829000 ns

class Problem031{
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        //Eye Rape Begins
        int counter = 1;
        for(int a=0; a<=200; a++) for(int b=0; b<=100; b++) for(int c=0; c<=40; c++) for(int d=0; d<= 20; d++) for(int e=0; e<= 10; e++) for(int f=0; f<=4; f++) for(int g=0; g<=2; g++) if(1*a+2*b+5*c+10*d+20*e+50*f+100*g == 200) counter++;
        System.out.println(counter);
        //Eye Rape Ends

        long totalTime = System.nanoTime() - startTime;
        System.out.println(totalTime);
    }
}
