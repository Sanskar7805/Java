public class AllOccurenceRecursion {
    public static void alloccurence(int arr[], int i, int key) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            System.out.println(i + "");
        }
        alloccurence(arr, i + 1, key);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 45, 6, 2, 7, 2, 2 };
        int key = 2;
        alloccurence(arr, 0, key);
        System.out.println();

    }
}
