import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileReader("input.txt"));

        String s1 = in.nextLine();

        System.out.println("Do you have string and string(1) or string and number(2)");

        String s2 = in.nextLine();

        int n  = in.nextInt();
    }
}