import java.util.List;
class Problem051{

    /*
    Framework:
    (1) Loop through every prime
    (2) Create a function so when inputted an integer, outputs a string[] with a * with the replaced digits
    (3) Create an array function that fills the asteriks up with numbers
    (4) Check if exactly 8 of them are prime
    */

    public static void main(String[] args) {

        //Prime Sieve
        int size =  1000000;
        boolean[] prime = new boolean[size+1];

        for(int i=0;i<size;i++) prime[i] = true; //pretend everythings a prime
        for(int p = 4; p <= size; p+=2) prime[p] = false; //even numbers aren't primes
        for(int p = 3; p*p <= size; p+=2){
            //Multiples of a prime aren't primes
            if(prime[p]) for(int i = p*2; i <= size; i += p)prime[i] = false;
        }

        for(int i = 0; i < numReplacement(replacedDigits(12345),12345).length-1; i++){
            System.out.println(numReplacement(replacedDigits(12345),12345)[i]);
        }

        // for(int i = 0; i < replacedDigits(12345).length-1; i++){
        //     System.out.println(replacedDigits(12345)[i]);
        // }
        //replacedDigits(123456);

    }

    // (2)
    static String[] replacedDigits(int n){
        // length is equal to (n-1)! - 1
        int lengthN = (""+n).length();
        int base2L = (int)Math.pow(2,lengthN);
        String[] possibilities = new String[base2L];
        //System.out.println(lengthN);


        for(int i = 1; i < possibilities.length-1; i++){
            String s = ""+n;
            int l = s.length();
            String[] keyList = binaryReplacement(6);

            String key = keyList[i];
            //System.out.println(key);

            for(int j = 0; j < l; j++){
                if(key.charAt(j) == 49 && j < l-1){
                    s = s.substring(0,j)+"*"+s.substring(j+1,l);
                    //System.out.println(s + " " + i);

                }
            }

            possibilities[i] = s;
        }
        return possibilities;
    }

    static int f(int n){
        int product = 1;
        for(int i=2;i<=n;i++) product*=i;
        return product;
    }

    static String[] binaryReplacement(int length){
        int base2L = (int)Math.pow(2,length);

        String[] s = new String[base2L];
        String currentS = "0000";

        for(int i = base2L; i < 2*base2L; i++){
            currentS = Integer.toString(i, 2);
            //System.out.println(currentS + " " + i);
            s[i-base2L] = currentS.substring(1,currentS.length());
        }

        return s;

    }

    static int[] numReplacement(String[] asteriks, int n){
        int[] nums = new int[10*asteriks.length];
        for(int i=0;i<10;i++){
            for(int j = 1; j < asteriks.length; j++){
                for(int h = 0; h < asteriks[1].length(); h++){
                    String s = ""+n;
                    //System.out.println(asteriks[j]);
                    if(asteriks[j].charAt(h) == '*'){
                        s = s.substring(0,h) + i + s.substring(h+1,s.length());
                    }
                    nums[i*asteriks.length+j] = Integer.valueOf(s);
                }
            }
        }
        return nums;
    }

}
