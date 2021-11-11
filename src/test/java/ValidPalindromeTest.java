import com.leetcode.ValidPalindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidPalindromeTest {
    @Test
    void emptyString() {
        assertEquals(Boolean.TRUE, ValidPalindrome.isPalindrome(""));
    }

    @Test
    void blankString() {
        assertEquals(Boolean.TRUE, ValidPalindrome.isPalindrome(" "));
    }

    @Test
    void palindromeWithSpaces() {
        assertEquals(Boolean.TRUE, ValidPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void notPalindrome() {
        assertEquals(Boolean.FALSE, ValidPalindrome.isPalindrome("race"));
    }

    @Test
    void notPalindromeWithSpaces() {
        assertEquals(Boolean.FALSE, ValidPalindrome.isPalindrome("race a car"));
    }

    @Test
    void withDigit() {
        assertEquals(Boolean.FALSE, ValidPalindrome.isPalindrome("0P"));
    }
}
