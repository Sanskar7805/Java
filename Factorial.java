import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num; // To hold number
        int fact = 1; // To hold Factorial
        System.out.println("Enter any positive integer");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial : " + fact);
    }
}