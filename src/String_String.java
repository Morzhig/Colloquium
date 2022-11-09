import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.NullString;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class String_String {
    public static String s1;
    public static String s2;
    public static int n;

    String_String() {
        s1 = "";
        s2 = "";
        n = 0;
    }
    String_String(String a1, String a2) {
        s1 = a1;
        s2 = a2;
    }
    String_String(String a1, int num) {
        s1 = a1;
        n = num;
    }

    String cat() {
        return s1.concat(s2);
    }

    String mulcat() {
        for (int i = 0; i < n; i++)
            s1 += s1;

        return s1;
    }
}
