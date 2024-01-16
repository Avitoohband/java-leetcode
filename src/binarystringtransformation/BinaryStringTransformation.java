package src.binarystringtransformation;

public class BinaryStringTransformation {

        public static int minFlipsToTransform(String s, String t) {
            // Check if transformation is possible
            if (s.length() != t.length() || s.charAt(0) != t.charAt(0) || s.charAt(s.length() - 1) != t.charAt(t.length() - 1)) {
                return -1; // Transformation is impossible
            }

            int flipCount = 0;
            // Iterate from the second character to the second-to-last character
            for (int i = 1; i < s.length() - 1; i++) {
                // Check if a flip is needed and possible at this index
                if (s.charAt(i) != t.charAt(i) && s.charAt(i - 1) != s.charAt(i + 1)) {
                    flipCount++;
                }
                if (s.charAt(i) != t.charAt(i) && t.charAt(i - 1) != t.charAt(i + 1)) {
                    flipCount++;
                }
            }
            return flipCount; // Return the total number of flips required
        }

        public static void main(String[] args) {
            String s = "0100";
            String t = "0010";
            System.out.println(minFlipsToTransform(s, t)); // Output should be 2
        }

}
