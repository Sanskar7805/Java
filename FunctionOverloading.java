public class FunctionOverloading {
    // sum of 2 numbers
    public static int sum(int a, int b) {
        return a + b;
    }

    // sum of 3 numbers
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
    }
}
