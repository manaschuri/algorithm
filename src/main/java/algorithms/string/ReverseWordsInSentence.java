package algorithms.string;

/*
Reverse words in a given String in Java

Input:
I love Java Programming

Output:
Programming Java love I
*/

import java.util.Stack;

public class ReverseWordsInSentence {

    public static void main(String[] args) {

        final String sentence = "Reverse words in a given String in Java";

        String[] split = sentence.split(" ");

        Stack stack = new Stack();
        for (int i = 0; i < split.length; i++) {
            stack.push(split[i]);
        }

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
