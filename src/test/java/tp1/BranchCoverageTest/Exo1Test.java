package tp1.BranchCoverageTest;

import org.junit.jupiter.api.Test;
import tp1.Palindrome;
import static org.junit.jupiter.api.Assertions.*;

public class Exo1Test {

    // Branch: s == null → true
    @Test
    void testNullThrows() {
        assertThrows(NullPointerException.class, () -> Palindrome.isPalindrome(null));
    }

    // Branch: s == null → false, while i<j → false (empty/single char)
    @Test
    void testEmptyString() {
        assertTrue(Palindrome.isPalindrome(""));
    }

    // Branch: while i<j → true, chars match → loop completes → return true
    @Test
    void testPalindrome() {
        assertTrue(Palindrome.isPalindrome("radar"));
    }

    // Branch: while i<j → true, chars don't match → return false
    @Test
    void testNotPalindrome() {
        assertFalse(Palindrome.isPalindrome("hello"));
    }
}