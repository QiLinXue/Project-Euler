/*

The number, 1406357289, is a 0 to 9 pandigital number because it is made up of each of the digits 0 to 9 in some order, but it also has a rather interesting sub-string divisibility property.

Let d1 be the 1st digit, d2 be the 2nd digit, and so on. In this way, we note the following:

d2d3d4=406 is divisible by 2
d3d4d5=063 is divisible by 3
d4d5d6=635 is divisible by 5
d5d6d7=357 is divisible by 7
d6d7d8=572 is divisible by 11
d7d8d9=728 is divisible by 13
d8d9d10=289 is divisible by 17

Find the sum of all 0 to 9 pandigital numbers with this property.

*/

// 07/29/2018: 1458746800 ns

class Problem043{
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        //Start Code
        long sum = 0;
        String[] perms = permutations();
        for(int i = 0; i < perms.length; i++) if(isSpecial(perms[i])) sum += Long.valueOf(perms[i]);
        System.out.println(sum);
        //End Code

        long totalTime = System.nanoTime() - startTime;
        System.out.println(totalTime);
    }

    static boolean isSpecial(String s){
        int[] primes = {2,3,5,7,11,13,17};
        for(int i = 1; i <= 7; i++){
            if(Integer.valueOf(s.substring(i,i+3)) % primes[i-1] != 0) return false;
        }
        return true;
    }

    static String[] permutations(){
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

        return ps;
    }
}
