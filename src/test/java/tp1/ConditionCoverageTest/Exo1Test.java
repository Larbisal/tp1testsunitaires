package tp1.ConditionCoverageTest;

import org.junit.jupiter.api.Test;
import tp1.Palindrome;
import static org.junit.jupiter.api.Assertions.*;

public class Exo1Test {

    // Condition: s == null → TRUE
    @Test
    void testNullThrows() {
        assertThrows(NullPointerException.class, () -> Palindrome.isPalindrome(null));
    }

    // Condition: s == null → FALSE, i < j → FALSE (skip loop entirely)
    @Test
    void testSingleChar() {
        assertTrue(Palindrome.isPalindrome("a"));
    }

    // Condition: i < j → TRUE, charAt mismatch → TRUE (return false)
    @Test
    void testNotPalindrome() {
        assertFalse(Palindrome.isPalindrome("hello"));
    }

    // Condition: i < j → TRUE, charAt mismatch → FALSE (chars match, loop continues)
    @Test
    void testPalindrome() {
        assertTrue(Palindrome.isPalindrome("kayak"));
    }

    // Condition: spaces + casing both active
    @Test
    void testPalindromeWithSpaces() {
        assertTrue(Palindrome.isPalindrome("Esope reste ici et se repose"));
    }
}