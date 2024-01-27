package src.differentnumbersdivisiblebythreechangeonedigit;

public class FindCountDivisibleByThree {
    public static void main(String[] args) {
        String str = "23";
        System.out.println(count(str));

    }

    public static int count(String str){
        int count = 0;

        int numSum = 0;
        for (char c : str.toCharArray()) {
            numSum += (c - 48);
        }

        count += numSum % 3 == 0 ? 1 : 0;

        for (int i = 0; i < str.length(); i++) {
            int tempSum = numSum -(str.charAt(i) -48);

            for (int j = 0 ; j <= 9; j++) {
                count += ((tempSum + j) % 3) == 0 ? 1 : 0;
            }
        }

        return count;
    }
}
