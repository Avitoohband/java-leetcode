package src.differentnumbersdivisiblebythreechangeonedigit;

public class FindCountDivisibleByThree {
    public static void main(String[] args) {
        String str = "23";
        int sol = count(str);

    }

    public static int count(String str){
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - 48;
        }

        System.out.println(sum);

        return 0;
    }
}
