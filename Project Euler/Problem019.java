/* I don't want to use Java's built in API so here's my _non cheating_ approach

*/

class Problem019{
    public static void main(String[] args) {
        int counter = 0;
        int day1=2,day2=5,day3=5,day4=1,day5=3,day6=6,day7=1,day8=4,day9=7,day10=2,day11=5,day12=7;

        //Also I got lazy. LMFAOOOOOOOOOOOOO
        for(int i=1900;i<=2000;i++){
            if(day1 % 7 == 0) counter++;
            if(day2 % 7 == 0) counter++;
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

            if(i % 4 == 0) day1++;
            if(i % 4 == 0) day2++;
            if(i % 4 == 0) day3++;
            if(i % 4 == 0) day4++;
            if(i % 4 == 0) day5++;
            if(i % 4 == 0) day6++;
            if(i % 4 == 0) day7++;
            if(i % 4 == 0) day8++;
            if(i % 4 == 0) day9++;
            if(i % 4 == 0) day10++;
            if(i % 4 == 0) day11++;
            if(i % 4 == 0) day12++;

            day1++;
        }
        System.out.println(counter);
    }
}
