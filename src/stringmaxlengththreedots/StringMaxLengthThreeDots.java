package src.stringmaxlengththreedots;

public class StringMaxLengthThreeDots {
    public static void main(String[] args) {

        System.out.println(apply("abcd", 4));
        System.out.println(apply("abcde", 3));
        System.out.println(apply("", -1));
        System.out.println(apply("", 0));
        System.out.println(apply(null, 0));

    }

    public static String apply(String text, int maxLength) {
        if (text == null || text.isEmpty() || maxLength < 0) return "";
        if (text.length() <= maxLength) return text;
        int maxIndex = Math.max(0, (maxLength - 3) + 1);

        return text.substring(0, maxIndex + 1) + "...";
    }
}


