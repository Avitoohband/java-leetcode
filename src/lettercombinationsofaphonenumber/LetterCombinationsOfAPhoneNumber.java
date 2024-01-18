package src.lettercombinationsofaphonenumber;

import java.util.*;

public class LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {

    }
    public static List<String> letterCombinations (String digits){
        Map<Integer, List<Character>> numbersToLetterMap = new HashMap<>();
        numbersToLetterMap.put(2, List.of('a', 'b', 'c'));
        numbersToLetterMap.put(3, List.of('d', 'e', 'f'));
        numbersToLetterMap.put(4, List.of('g', 'h', 'i'));
        numbersToLetterMap.put(5, List.of('j', 'k', 'l'));
        numbersToLetterMap.put(6, List.of('m', 'n', 'o'));
        numbersToLetterMap.put(7, List.of('p', 'q', 'r', 's'));
        numbersToLetterMap.put(8, List.of('t', 'u', 'v'));
        numbersToLetterMap.put(9, List.of('w', 'x', 'y', 'z'));

        List<String> solution = new ArrayList<>();
        //for every letter in digits, add all possible solutions, when reached last digits , add the sol to array

        if(digits.length() < 1 ) return Collections.emptyList();

        for (Character c : numbersToLetterMap.get(digits.toCharArray()[0])) {
            buildString()
        }
    }
}
