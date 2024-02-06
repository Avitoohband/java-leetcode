package src.lettercombinationsofaphonenumber;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {

        System.out.println(letterCombinations("23"));

    }

    public static List<String> letterCombinations(String digits) {
        if (digits.length() < 1) return List.of(digits);


        String[] keypad = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> solutions = new ArrayList<>();

        solve(solutions, "", keypad, digits, 0);

        return solutions;

    }

    public static void solve(List<String> solutions, String currentComb,
                             String[] keypad, String digits, int digitsIndex) {

        if (currentComb.length() == digits.length()) {
            solutions.add(currentComb);
        } else {
            for (Character c : keypad[digits.charAt(digitsIndex) - '2'].toCharArray()) {
                solve(solutions, currentComb + c, keypad, digits, digitsIndex + 1);
            }
        }
    }

}
