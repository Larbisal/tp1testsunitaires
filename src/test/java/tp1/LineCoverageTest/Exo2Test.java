package tp1.LineCoverageTest;

import org.junit.jupiter.api.Test;
import tp1.Anagram;
import static org.junit.jupiter.api.Assertions.*;

public class Exo2Test {

    // Covers: null check line (s1 == null)
    @Test
    void testNullS1Throws() {
        assertThrows(NullPointerException.class,
                () -> Anagram.isAnagram(null, "niche"));
    }

    // Covers: null check line (s2 == null)
    @Test
    void testNullS2Throws() {
        assertThrows(NullPointerException.class,
                () -> Anagram.isAnagram("chien", null));
    }

    // Covers: toLowerCase, replaceAll, length check, return false
    @Test
    void testDifferentLengths() {
        assertFalse(Anagram.isAnagram("hi", "hello"));
    }

    // Covers: for loop, count array, return true
    @Test
    void testIsAnagram() {
        assertTrue(Anagram.isAnagram("chien", "niche"));
    }

    // Covers: second for loop, c != 0, return false
    @Test
    void testNotAnagram() {
        assertFalse(Anagram.isAnagram("hello", "world"));
    }
}