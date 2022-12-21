import javax.sound.sampled.SourceDataLine;

public class FunctionOverloading1 {
    // Add 2 integer value
    public static int sum(int a, int b) {
        return a + b;
    }

    // Add 2 float value
    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(10, 15));
        System.out.println(sum(1.5f, 2.3f));
    }
}