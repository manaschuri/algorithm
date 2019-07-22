package algorithms.dynamicprogramming;

public class FibonacciSeries {

    public static void main(String[] args) {
        final int number = 9;
        //printArray(loop(number));

        for(int i=0; i < number; i++)
        {
            int recursion = recursion(i);
            System.out.print(recursion +" ");
        }
    }

    private static int[] loop(final int number) {
        int[] fibonacci = new int[number];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < number; i++) {
            fibonacci[i] = fibonacci[i-2] + fibonacci[i-1];
        }
        return fibonacci;
    }

    private static int recursion(int number) {
        if (number == 0)
            return 0;
        else if (number == 1)
            return 1;
        else
            return (recursion(number -1) + recursion(number - 2));
    }

    private static void printArray(final int[] fibonacci) {
        for (int i = 0; i < fibonacci.length; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}
