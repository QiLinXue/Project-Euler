/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

class Problem5{
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        boolean notDivisible = true;
        int testedNumber = 0;

        while(notDivisible){
            testedNumber++;
            if(isDivisible(testedNumber)){
                notDivisible = false;
            }
        }

        System.out.println(testedNumber);

        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("total time: "+totalTime);
    }

    static boolean isDivisible(int number){
        for(int i=1;i<=20;i++){
            if(number % i != 0){
                return false;
            }
        }
        return true;
    }
}
