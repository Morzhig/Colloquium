import static org.junit.jupiter.api.Assertions.*;

class String_StringTest {

    @org.junit.jupiter.api.Test
    void Test1() {
        String s1 = "abc";
        String s2 = "abc";
        String res = "abcabc";

        assertEquals(new String_String(s1, s2).cat(), res);
    }

    @org.junit.jupiter.api.Test
    void Test2() {
        String s1 = "abc";
        int n = 3;
        String res = "abcabcabc";

        assertEquals(new String_String(s1, n).mulcat(), res);
    }
}