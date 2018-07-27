import java.util.Arrays;

/*

What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?

*/

// 07/26/2018: 1937583300 ns
// 07/27/2018: 1014500 ns

class Problem024{
    static boolean[] digits = new boolean[10];
    static int[] p = new int[10];
    static int permCounter = 0;

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        //archivedMethod(); //use this for a very inefficient method

        //Code Starts
        for(int i = 0; i < digits.length; i++) digits[i] = true;
        int n = 1000000;
        int pSum = 0;
        for(int h=9;h>0;h--){
            for(int i=0;i<9;i++){
                if(pSum+i*f(h) > n){
                    updateDigits(i-1);
                    pSum += (i-1)*f(h);
                    break;
                }
            }
        }

        for(int i=0;i<9;i++) System.out.print(p[i]);
        System.out.println();
        //Code Ends

        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);

    }

    static void updateDigits(int n){
        boolean didIFindIt = false;
        int i = 0, falseCounter = 0;
        while(!didIFindIt){
            if(digits[i+falseCounter]){
                if(i == n){
                    digits[i+falseCounter] = false;
                    p[permCounter] = i+falseCounter;
                    permCounter++;
                    break;
                }
                i++;

            }
            else falseCounter++;
        }
    }

    static int f(int n){
        int product = 1;
        for(int i=2;i<=n;i++) product*=i;
        return product;
    }

    //Staircase to heaven
    //Below is the archived
    static void archivedMethod(){
        String[] ps = new String[3628800];

        String test = "";
        int z=0;
        for(int a=0;a<10;a++){
            for(int b=0;b<10;b++){
                if(b != a){
                    for(int c=0;c<10;c++){
                        if(c != a && c!= b){
                            for(int d=0;d<10;d++){
                                if(d != c && d!= b && d!= a){
                                    for(int e=0;e<10;e++){
                                        if(e != a && e!= b && e!= c && e!= d){
                                            for(int f=0;f<10;f++){
                                                if(f != a && f!= b && f!= c && f!= d && f!=e){
                                                    for(int g=0;g<10;g++){
                                                        if(g != a && g!= b && g!= c && g!= d && g!=e && g!=f){
                                                            for(int h=0;h<10;h++){
                                                                if(h!=a&&h!=b&&h!=c&&h!=d&&h!=e&&h!=f&&h!=g){
                                                                    for(int i=0;i<10;i++){
                                                                        if(i!=a&&i!=b&&i!=c&&i!=d&&i!=e&&i!=f&&i!=g&&i!=h){
                                                                            for(int j=0;j<10;j++){
                                                                                if(j!=a&&j!=b&&j!=c&&j!=d&&j!=e&&j!=f&&j!=g&&j!=h&&j!=i){
                                                                                    test = ""+a+b+c+d+e+f+g+h+i+j;
                                                                                    ps[z]=test;
                                                                                    z++;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println(ps[1000000-1]);
    }
}
