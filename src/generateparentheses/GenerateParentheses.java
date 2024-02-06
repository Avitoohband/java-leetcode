package src.generateparentheses;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {

        int n = 3;
        System.out.println(generateParentheses(n));
        // Output: ["((()))","(()())","(())()","()(())","()()()"]
    }

    public static List<String> generateParentheses(int n) {
        List<String> solution = new ArrayList<>();

        solve(solution, n, "", 0, 0);

        return solution;
    }

    private static void solve(List<String> solution, int n, String currentString, int open, int close) {
        if (currentString.length() == n * 2) {
            solution.add(currentString);
            return;
        }
        if (open < n) {
            solve(solution, n, currentString + "(", open + 1, close);
        }
        if (close < open) {
            solve(solution, n, currentString + ")", open, close + 1);
        }
    }
}
