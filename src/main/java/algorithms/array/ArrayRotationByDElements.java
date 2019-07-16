package algorithms.array;

/*
Rotate array by dth index

Input:
arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}
D = 3

Output:
4, 5, 6, 7, 8, 9, 10, 11, 12, 1, 2, 3

Solution:-
1. Divide array into multiple parts based on GCD.
2. If GCD is 3 then divide array into 3 parts. i.e. {1, 4, 7, 10} {2, 5, 8, 11} {3, 6, 9, 12}. In the multiple of GCD
3. Try to sort one set at a time
 */

public class ArrayRotationByDElements {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int d = 3;

        leftRotate(arr, 3, 13);
        printArray(arr);

//        int gcd = gcd(d, arr.length);
//
//        for (int i = 0; i < gcd; i++) {
//            int temp = arr[i];
//            int lastPosition = i;
//
//            while (true) {
//                int newPosition = lastPosition + gcd;
//
//                if (newPosition >= arr.length) {
//                    arr[lastPosition] = temp;
//                    break;
//                }
//
//                arr[lastPosition] = arr[newPosition];
//                lastPosition = newPosition;
//            }
//            printArray(arr);
//            System.out.println("");
//        }
    }

    static void leftRotate(int arr[], int d, int n)
    {
        for (int i = 0; i < gcd(d, n); i++) {
        /* move i-th values of blocks */
            int temp = arr[i];
            int j = i;

            while (true) {
                int k = j + d;
                if (k >= n)
                    k = k - n;

                if (k == i)
                    break;

                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }

    static int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    static void printArray(int arr[])
    {
        int i;
        for (i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}

