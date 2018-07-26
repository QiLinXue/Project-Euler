class Problem012{
    public static void main(String[] args) {
        boolean finished = false;
        int i = 0;
        int triangle = 0;

        while (!finished){
            i++;
            triangle = (i*(i+1))/2;
            System.out.println(triangle);
            if(divisors(triangle) > 500){
                finished = true;
                System.out.println(triangle);
            }
        }

        //System.out.println(divisors(28));
    }

    static int divisors(int n){
        int counter = 0;
        for(int i=1;i*i<n;i++){
            if(n % i == 0){
                counter+=2;
            }
        }
        return counter;
    }

}
