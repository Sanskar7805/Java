import java.util.Scanner;

public class Average {
    public static int average(int x, int y, int z) {
        return (x + y + z) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x");
        int x = sc.nextInt();
        System.out.print("Enter the value of y");
        int y = sc.nextInt();
        System.out.print("Enter the value of z");
        int z = sc.nextInt();
        System.out.print("The average of 3 numbers is" + average(x, y, z) + "/n");
    }
}