import java.io.*;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) throws IOException {

		File temp = new File("text.txt");
        Scanner file = new Scanner(temp);
        String text = file.nextLine();
        System.out.println(text);

        file.close();
	}

}
