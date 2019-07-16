package algorithms.array;

/*
Rotate array by dth index

Input:
arr[] = {1, 0, 3, 4, 0, 6, 7, 0, 9, 0, 0, 12}

Output:
1, 12, 3, 4, 9, 6, 7, 0, 0, 0, 0, 0
*/

public class ShiftAllZeroToRight {

    public static void main(String[] args) {

        int arr[] = {1, 0, 3, 4, 0, 6, 7, 0, 9, 0, 0, 12, 0, 0, 0};

        int rightPointer = arr.length - 1;

        for (int leftPointer = 0; leftPointer < arr.length; leftPointer++) {

            while (arr[rightPointer] == 0) {
                rightPointer --;
            }

            if (leftPointer < rightPointer) {
                if (arr[leftPointer] == 0) {
                    int temp = arr[leftPointer];
                    arr[leftPointer] = arr[rightPointer];
                    arr[rightPointer] = temp;
                }
                printArray(arr);
            }
        }
    }

    static void printArray(int arr[]) {
        int i;
        for (i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

    }
}
