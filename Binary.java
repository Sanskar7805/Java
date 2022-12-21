public class Binary {
    public static void binToDec(int n) {
        int pow = 0;
        int decNum = 0;
        int binNum = n;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("decimal of" + binNum + " = " + decNum);
    }

    public static void main(String[] args) {
        binToDec(101);
    }
}
