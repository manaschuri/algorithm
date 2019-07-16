package algorithms.array;

/*
Given a set of time intervals in any order,
merge all overlapping intervals into one and output the result which should have only mutually exclusive intervals.
Let the intervals be represented as pairs of integers for simplicity.

Input:
{{1,3}, {2,4}, {5,7}, {6,8}}

Output:
{1, 4} {5, 8}

Solution:
1. Sort the intervals based on increasing order of
    starting time.
2. Push the first interval on to a stack.
3. For each interval do the following
   a. If the current interval does not overlap with the stack
       top, push it.
   b. If the current interval overlaps with stack top and ending
       time of current interval is more than that of stack top,
       update stack top with the ending  time of current interval.
4. At the end stack contains the merged intervals.
 */

import java.util.Arrays;
import java.util.Stack;

public class MergeOverlappingIntervals {

    public static void main(String[] args) {
        Interval interval[] =  new Interval[4];
        interval[0]=new Interval(6,8);
        interval[1]=new Interval(1,9);
        interval[2]=new Interval(4,7);
        interval[3]=new Interval(2,4);

        Arrays.sort(interval, (o1, o2) -> {
            if (o1.start < o2.start)
                return -1;
            else
                return 1;
        });

        printArray(interval);

        Stack<Interval> output = new Stack<>();

        output.push(interval[0]);
        for (int i = 1; i < interval.length; i++) {
            Interval peek = output.peek();
            if (peek.end > interval[i].start) {
                Interval element = output.pop();
                int end = (element.end > interval[i].end) ? element.end : interval[i].end;
                Interval mergedInterval = new Interval(element.start, end);
                output.push(mergedInterval);
            } else {
                output.push(interval[i]);
            }
        }
        printArray(output.toArray());
    }

    static void printArray(Object[] arr) {
        int i;
        for (i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

    }

    static class Interval {
        int start,end;

        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public String toString() {
            return "Interval{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }
    }
}
