package org.july_24.codeforces;

/*deletes all the vowels,
inserts a character "." before each consonant,
replaces all uppercase consonants with corresponding lowercase ones.*/

public class StringTask {

    public static String sTask(String s) {
        s = s.toLowerCase();

        // Initialize a StringBuilder to build the result
        StringBuilder result = new StringBuilder();

        // Define the set of vowe

        // Iterate over each character in the input string
        for (char c : s.toCharArray()) {
            // Check if the character is a vowel
            if (!isVowel(c)) {
                // If it's not a vowel, append '.' and the consonant to the result
                result.append('.').append(c);
            }
        }
        return result.toString();
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U';
    }
}
