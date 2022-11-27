package LeetCode;

public class PivotIndexInArray {
    public static void main(String[] args) {

        int arr[] = { 1, 7, 3, 6, 5, 6 };
        int pivot = 0;
        for (int i = 0; i < arr.length; i++) {
            pivot = i * (i + 1) / 2;

        }
        System.out.println(pivot);

    }
}
