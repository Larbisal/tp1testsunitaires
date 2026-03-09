package tp1.BranchCoverageTest;

import org.junit.jupiter.api.Test;
import tp1.Anagram;
import static org.junit.jupiter.api.Assertions.*;

public class Exo2Test {

    // Branch: s1 == null → true
    @Test
    void testNullS1Throws() {
        assertThrows(NullPointerException.class,
                () -> Anagram.isAnagram(null, "niche"));
    }

    // Branch: s2 == null → true
    @Test
    void testNullS2Throws() {
        assertThrows(NullPointerException.class,
                () -> Anagram.isAnagram("chien", null));
    }

    // Branch: s1 == null → false, s2 == null → false, lengths differ → true
    @Test
    void testDifferentLengths() {
        assertFalse(Anagram.isAnagram("hi", "hello"));
    }

    // Branch: lengths equal, all counts zero → return true
    @Test
    void testIsAnagram() {
        assertTrue(Anagram.isAnagram("chien", "niche"));
    }

    // Branch: lengths equal, some count != 0 → return false
    @Test
    void testNotAnagram() {
        assertFalse(Anagram.isAnagram("hello", "world"));
    }

    // Branch: spaces and casing handled
    @Test
    void testAnagramWithSpacesAndCase() {
        assertTrue(Anagram.isAnagram("Astronomer", "Moon starer"));
    }
}