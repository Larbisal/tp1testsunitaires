package tp1.LineCoverageTest;

import org.junit.jupiter.api.Test;
import tp1.Palindrome;
import static org.junit.jupiter.api.Assertions.*;

public class Exo1Test {

    // Covers: null check line
    @Test
    void testNullThrows() {
        assertThrows(NullPointerException.class, () -> Palindrome.isPalindrome(null));
    }

    // Covers: toLowerCase, replaceAll, while loop, return true
    @Test
    void testSimplePalindrome() {
        assertTrue(Palindrome.isPalindrome("kayak"));
    }

    // Covers: return false inside while
    @Test
    void testNotPalindrome() {
        assertFalse(Palindrome.isPalindrome("hello"));
    }

    // Covers: spaces and casing logic
    @Test
    void testPalindromeWithSpaces() {
        assertTrue(Palindrome.isPalindrome("Esope reste ici et se repose"));
    }
}