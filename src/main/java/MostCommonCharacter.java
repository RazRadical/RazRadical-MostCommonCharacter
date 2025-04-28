import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        if (str == null || str.isEmpty()) {
            return '\0';
        }

        Map<Character, Integer> letterCount = new HashMap<>();
        for (char letter : str.toCharArray()) {
            letterCount.put(letter, letterCount.getOrDefault(letter, 0) + 1);
        }

        char mostFreq = '\0';
        int maxCounter = 0;

        for (char letter : str.toCharArray()) {
            int count = letterCount.get(letter);
            if (count > maxCounter) {
                maxCounter = count;
                mostFreq = letter;
            }
        }

        return mostFreq;
    }
}