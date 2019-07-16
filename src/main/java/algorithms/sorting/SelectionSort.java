package algorithms.sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int array[] = {5, 2, 9, 3, 1};

        int minimum;

        for (int i = 0; i < array.length-1; i++) {
            minimum = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[minimum] > array[j]) {
                    minimum = j;
                }
            }
            int temp = array[minimum];
            array[minimum] = array[i];
            array[i] = temp;
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

