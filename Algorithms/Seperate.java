class Seperate{
    public static void main(String[] args) {
        String numSequence = "1 2 3 4 5";
        for(int i=0;i<seperateInt(numSequence, 5).length;i++){
            System.out.println(seperateInt(numSequence, 5)[i]);
        }

        String stringSequence = "hello my name is qiln";
        for(int i=0;i<seperateString(stringSequence, 5).length;i++){
            System.out.println(seperateString(stringSequence, 5)[i]);
        }

    }

    static public int[] seperateInt(String message, int size){
        int lastNumberEndsAt = 0;
        int[] seperatedMessage = new int[5];
        int numCounter = 0;
        for(int i=0; i<message.length(); i++){
            if(message.charAt(i) == ' '){
                seperatedMessage[numCounter] = Integer.parseInt(message.substring(lastNumberEndsAt, i));
                numCounter++;
                lastNumberEndsAt = i+1;
            }
        }
        seperatedMessage[numCounter] = Integer.parseInt(message.substring(lastNumberEndsAt));

        return seperatedMessage;
    }

    static public String[] seperateString(String message, int size){
        int lastWordEndsAt = 0;
        String[] seperatedMessage = new String[size];
        int wordCounter = 0;
        for(int i=0; i<message.length(); i++){
            if(message.charAt(i) == ' '){
                seperatedMessage[wordCounter] = message.substring(lastWordEndsAt, i);
                wordCounter++;
                lastWordEndsAt = i+1;
            }
        }
        seperatedMessage[wordCounter] = message.substring(lastWordEndsAt);

        return seperatedMessage;
    }

}
