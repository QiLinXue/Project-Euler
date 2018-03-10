import java.util.*;

public class test{
	public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(4);

        System.out.println(list.get(0)); // prints "Hello!"

        for (Integer s : list) {
            System.out.print(s);
        } // prints "Hello!", "How are you?"
	}
}
