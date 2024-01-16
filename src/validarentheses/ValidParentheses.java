package src.validarentheses;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {

    }

    class Solution {
        public boolean isValid(String s) {
            Stack stack = new Stack();

            for (char c : s.toCharArray()) {
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.isEmpty() || (char) stack.pop() != '(') {
                        return false;
                    }
                } else if (c == '}') {
                    if (stack.isEmpty() || (char) stack.pop() != '{') {
                        return false;
                    }
                } else if (c == ']') {
                    if (stack.isEmpty() || (char) stack.pop() != '[') {
                        return false;
                    }
                }

            }
            return stack.isEmpty();
        }
    }
}
