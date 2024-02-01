package src.ransomnote;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class RansomNote {
    public static void main(String[] args) {

        String ransomNote = "a";
        String magazine = "b";
        //Output: false

        String ransomNote1 = "aa";
        String magazine1 = "ab";
        //Output: false

        String ransomNote2 = "aa";
        String magazine2 = "aab";
        //Output: true
        System.out.println(canConstructs(ransomNote, magazine));
        System.out.println(canConstructs(ransomNote1, magazine1));
        System.out.println(canConstructs(ransomNote2, magazine2));

    }

    public static boolean canConstructs(String ransomNote, String magazine) {
        int[] ascii = new int[256];
        for (char c : magazine.toCharArray()) {
            ascii[c]++;
        }

        for (char c : ransomNote.toCharArray()) {
            ascii[c]--;
            if (ascii[c] < 0) return false;
        }
        return true;
    }
}
