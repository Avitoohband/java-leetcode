package src.easy.ransomnote;

public class RansomNoteV2 {
    public static void main(String[] args) {
        String ransom  = "yossi";
        String magazine = "jkdyfsilfkos";

        System.out.println(canConstruct(ransom, magazine));

    }

    public static boolean canConstruct(String ransom, String magazine){
        int[] asciiTable = new int[256];

        for (int i = 0; i < magazine.length(); i++) {
            asciiTable[magazine.charAt(i)]++;
        }

        for (int i = 0; i < ransom.length(); i++) {
            asciiTable[ransom.charAt(i)]--;
            if(asciiTable[ransom.charAt(i)] < 0) return false;
        }
        return true;
    }
}
