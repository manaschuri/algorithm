package algorithms.array;

/*
Given an array and an integer K, find a maximum for each and every contiguous subarray of size k

Input:
arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6}
K = 3

Output:
3 3 4 5 5 5 6
 */

public class SlidingWindowMaximum {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int windowSize = 3;

        for (int i = 0; i < arr.length - windowSize + 1; i++) {
            int max = arr[i];
            for (int j = i; j < i + windowSize; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            System.out.print("\t" + max);
        }
    }
}

