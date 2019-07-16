package algorithms.string;

/*
Remove Duplicate Characters From Strings

Input:
geeksforgeeks

Output:
geksfor
*/

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateCharactersFromStrings {

    public static void main(String[] args) {

        final String input = "geeksforgeeks";
        StringBuffer output = new StringBuffer();
        char[] inputChars = input.toCharArray();
        List chars = new ArrayList();

        for (int i = 0; i < inputChars.length; i++) {
            if (! chars.contains(inputChars[i])) {
                output.append(inputChars[i]);
                chars.add(inputChars[i]);
            }
        }

        System.out.println(output.toString());
    }
}
