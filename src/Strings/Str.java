package Strings;

public class Str {
    String s1;
    String s2;
    String type = "";

    public Str(String s1_, String s2_) {
        s1 = s1_;
        s2 = s2_;
    }
    public String getStringType() {
        if (s2.matches("[-+]?\\d+"))
            type = "Num";
        else
            type = "String";
        return type;
    }
}
