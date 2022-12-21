public class Solution {
    public static void main(String[] args) {
        int[][] array = { { 4, 7, 8 },
                { 8, 8, 7 } };
        int countof7 = 0;
        for (int i = 0; i <= matrix.length; i++) {
            for (int j = 0; j <= matrix[0].length - 1; j++) {
                if (array[i][j] == 7) {
                    countof7++;
                }
            }
        }
        System.out.println("count of 7 is : " + countof7);
    }
}
