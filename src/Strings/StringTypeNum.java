package Strings;

import Interface.Type;

public class StringTypeNum implements Type {
    public static String cat(String s1, int n) {
        return String.valueOf(s1).repeat(Math.max(0, n));
    }
}
