package Tests;

import Strings.ConcatenationFacade;
import Strings.Str;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcatenationFacadeTest {
    @Test
    void getTypeString() {
        Str s = new Str("abc", "abc");
        assertEquals("String", s.getStringType());
    }
    @Test
    void getTypeNum() {
        Str s = new Str("abc", "3");
        assertEquals("Num", s.getStringType());
    }
    @Test
    void TypeString_Concat() {
        Str s = new Str("abc", "abc");
        assertEquals("abcabc", new ConcatenationFacade().Concatenation(s));
    }
    @Test
    void TypeNum_Concat() {
        Str s = new Str("abc", "3");
        assertEquals("abcabcabc", new ConcatenationFacade().Concatenation(s));
    }
}