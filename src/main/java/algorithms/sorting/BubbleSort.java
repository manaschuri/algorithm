package algorithms.sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int array[] = {5, 2, 9, 3, 1};

        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        printArray(array);
    }

    static void printArray(int arr[]) {
        int i;
        for (i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

    }
}

