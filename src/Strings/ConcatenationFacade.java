package Strings;

import java.util.Objects;

public class ConcatenationFacade {
    public String Concatenation(Str s) {
        String result;

        if (Objects.equals(s.getStringType(), "Num"))
            result = StringTypeNum.cat(s.s1, Integer.parseInt(s.s2));
        else
            result = StringTypeString.cat(s.s1, s.s2);

        return result;
    }
}
