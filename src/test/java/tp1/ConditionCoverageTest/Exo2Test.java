package tp1.ConditionCoverageTest;

import org.junit.jupiter.api.Test;
import tp1.Anagram;
import static org.junit.jupiter.api.Assertions.*;

public class Exo2Test {

    // Condition: s1 == null → TRUE (short-circuit, s2 not evaluated)
    @Test
    void testNullS1Throws() {
        assertThrows(NullPointerException.class,
                () -> Anagram.isAnagram(null, "niche"));
    }

    // Condition: s1 == null → FALSE, s2 == null → TRUE
    @Test
    void testNullS2Throws() {
        assertThrows(NullPointerException.class,
                () -> Anagram.isAnagram("chien", null));
    }

    // Condition: both null → FALSE, s1.length() != s2.length() → TRUE
    @Test
    void testDifferentLengths() {
        assertFalse(Anagram.isAnagram("hi", "hello"));
    }

    // Condition: lengths equal → FALSE (same length), c != 0 → FALSE → return true
    @Test
    void testIsAnagram() {
        assertTrue(Anagram.isAnagram("chien", "niche"));
    }

    // Condition: lengths equal → FALSE, c != 0 → TRUE → return false
    @Test
    void testNotAnagram() {
        assertFalse(Anagram.isAnagram("hello", "world"));
    }

    // Condition: casing + spaces both stripped correctly
    @Test
    void testAnagramWithSpacesAndCase() {
        assertTrue(Anagram.isAnagram("Astronomer", "Moon starer"));
    }
}