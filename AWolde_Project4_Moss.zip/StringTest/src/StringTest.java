import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// This is a test class for the String class methods
public class StringTest {

    
    public void testLength() {
        
        String str = "My name is Aleazar";

        // Verify that the length of the string is 18
        int expectedLength = 18;
        int actualLength = str.length();
        assertEquals(expectedLength, actualLength, "Length of the string should be 18.");
    }

    // Test the charAt() method of the String class.
   
    public void testCharAt() {
        // Given a string
        String str = "My name is Aleazar";

        // Verify that the character at index 11 is 'A'
        char expectedChar = 'A';
        char actualChar = str.charAt(11);
        assertEquals(expectedChar, actualChar, "Character at index 11 should be 'A'.");
    }

    // Test the substring() method of the String class.
    
    public void testSubstring() {
        
        String str = "My name is Aleazar";

        
        String expectedSubstring = "Aleazar";
        String actualSubstring = str.substring(11);
        assertEquals(expectedSubstring, actualSubstring, "Substring starting from index 11 should be 'Aleazar'.");
    }

    // Test the indexOf() method of the String class.
    @Test
    public void testIndexOf() {
        // Given a string
        String str = "My name is Aleazar";

        // Verify that the index of "Aleazar" in the string is 11
        int expectedIndex = 11;
        int actualIndex = str.indexOf("Aleazar");
        assertEquals(expectedIndex, actualIndex, "Index of 'Aleazar' in the string should be 11.");
    }
}


