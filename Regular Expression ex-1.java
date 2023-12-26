import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp {
    public static void main(String[] args) {
        // Define a regular expression pattern
        String regexPattern = "[a-zA-Z]+\\d+"; // This pattern matches one or more letters followed by one or more digits

        // Test strings
        String testString1 = "abc123";
        String testString2 = "xyz";
        String testString3 = "123abc";

        // Verify if the test strings match the regular expression pattern
        verifyPattern(testString1, regexPattern);
        verifyPattern(testString2, regexPattern);
        verifyPattern(testString3, regexPattern);
    }

    // Method to verify if a string matches a regular expression pattern
    private static void verifyPattern(String input, String pattern) {
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(input);

        System.out.println("String: " + input);
        System.out.println("Pattern: " + pattern);

        if (matcher.matches()) {
            System.out.println("Match found!\n");
        } else {
            System.out.println("No match found.\n");
        }
    }
}