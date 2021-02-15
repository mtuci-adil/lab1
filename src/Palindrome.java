import java.util.Arrays;

/**
 * Simple check of a string for a palindrome
 * by comparing its forward and backward versions.
 *
 * @author Adil Haidar
 */
public class Palindrome {
    /**
     * Checks whether String is a palindrome.
     *
     * @param s the {@code String} to check for a palindrome.
     * @return {@code true} if the {@code String} is a palindrome.
     */
    static boolean isPalindrome(String s) {
        String comp = replaceSpecial(s);
        return comp.contentEquals(reverseString(comp));
    }

    /**
     * Finds the reversed {@code String} for s.
     *
     * @param s the {@code String} to reverse.
     * @return backward version of the {@code String} parameter s.
     */
    private static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    /**
     * Replaces {@code String} with a new one containing only letters, digits, and spaces.
     *
     * @param s the {@code String} to remove non-letters and non-digits.
     * @return {@code String}, converted to a lower-case, containing only letters, digits, and spaces.
     */
    private static String replaceSpecial(String s) {
        return s.replaceAll("[^\\w\\d ]+", "").toLowerCase();
    }

    public static void main(String[] args) {
        Arrays.stream(args).forEach(s -> System.out.printf("\"%s\" IS%s a palindrome.\n",
                s, isPalindrome(s) ? "" : " NOT"));
    }
}
