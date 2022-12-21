public class BitManipulation4 {
    public static void main(String[] args) {
        // convert uppercase to lowercase
        for (char ch = 'A'; ch <= 'z'; ch++) {

            System.out.println((char) (ch | ' '));
        }
    }
}