package LeetCode;

//below comment name is Document type comment

/**
 * @Leetcode easy Problem
 * @question- Running sum of 1d array
 * @Input 1,2,3,4
 * @Output 1,3,6,10
 * 
 */

public class RunningSumOf1DArray {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4 };
        System.out.print("1" + " ");
        for (int i = 1; i < a.length; ++i) {
            a[i] += a[i - 1];

            System.out.print(a[i] + " ");
        }

    }
}
