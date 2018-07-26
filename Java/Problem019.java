/* I don't want to use Java's built in API so here's my _non cheating_ approach

How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?

*/

// 07/26/2018: 739000 ns
class Problem019{
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        //Code Starts
        int counter = 0;
        int day1=2,day2=5,day3=5,day4=1,day5=3,day6=6,day7=1,day8=4,day9=7,day10=2,day11=5,day12=7;

        //Also I got lazy. LMFAOOOOOOOOOOOOO
        for(int i=1901;i<=2000;i++){
            if(day1 % 7 == 0) counter++;
            if(day2 % 7 == 0) counter++;

            if(i % 4 == 0){day3++;day4++;day5++;day6++;day7++;day8++;day9++;day10++;day11++;day12++;}

            if(day3 % 7 == 0) counter++;
            if(day4 % 7 == 0) counter++;
            if(day5 % 7 == 0) counter++;
            if(day6 % 7 == 0) counter++;
            if(day7 % 7 == 0) counter++;
            if(day8 % 7 == 0) counter++;
            if(day9 % 7 == 0) counter++;
            if(day10 % 7 == 0) counter++;
            if(day11 % 7 == 0) counter++;
            if(day12 % 7 == 0) counter++;

            if(i % 4 == 0){ day1++; day2++;}
            day1++;day2++;day3++;day4++;day5++;day6++;day7++;day8++;day9++;day10++;day11++;day12++;
        }
        System.out.println(counter);
        //Code Ends

        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }
}
