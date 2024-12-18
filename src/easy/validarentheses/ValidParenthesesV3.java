package src.easy.validarentheses;

import java.lang.reflect.Parameter;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesesV3 {
    public static void main(String[] args) {
        String s = "()[]{}";
        String s2 = "(]";
        String s3 = "([])";

        System.out.println(isValid(s));
        System.out.println(isValid(s2));
        System.out.println(isValid(s3));
    }

    public static boolean isValid(String s) {
        Map<Character, Character> parentheses = Map.of(
                '(',')',
                '[', ']',
                '{','}'
        );
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if(parentheses.containsKey(c)) stack.push(c);
            else if(stack.isEmpty() || parentheses.get(stack.pop()) != c) return false;
        }

        return stack.isEmpty();
    }
}
