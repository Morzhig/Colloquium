import Strings.ConcatenationFacade;
import Strings.Str;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s1, s2;

        System.out.println("Enter first string.");
        s1 = in.next();

        System.out.println("Enter second string.");
        s2 = in.next();

        Str s = new Str(s1, s2);
        System.out.println(new ConcatenationFacade().Concatenation(s));
    }
}