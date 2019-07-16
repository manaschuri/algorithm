package algorithms.sorting;

public class InsertionSort {

    public static void main(String[] args) {
        int array[] = {5, 2, 9, 3, 1};

        for (int i = 0; i < array.length; i++) {
            int selectedElement = array[i];
            int j = i;

            while (j > 0 && selectedElement < array[j - 1]) {
                array[j] = array[j - 1];
                j = j - 1;
            }
            array[j] = selectedElement;
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

