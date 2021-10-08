package c1_ArraysStrings.p1_2_CheckPermutation;

import java.util.Arrays;

public class Solution {
    public static boolean isPermutation(String str1, String str2){
        if (str1.length() != str2.length())
            return false;

        //assuming the permutations are not case-sensitive.
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char arr[] = str1.toCharArray();

        for (int i = 0; i <str2.length(); i++)
        {
            boolean flag = false;
            char c = str2.charAt(i);
            for (int j = 0; j < arr.length; j++)
            {
                if (arr[j] == c)
                {
                    arr[j] = ' '; // replacing by whitespaces means that the string can not contain whitespace.
                    flag = true;
                    break;
                }
            }
            if (!flag)
                return false;
        }
        return true;
    }


    // Second solution
    public static String sort (String str)
    {
        char [] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static boolean isPermutationV2(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        //assuming the permutations are not case-sensitive.
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (sort(str1).equals(sort(str2)))
            return true;
        else
            return false;
    }


    // Another solution
    public static boolean isPermutationV3(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        //assuming the permutations are not case-sensitive.
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // assuming 128 chars
        int [] charCount = new int[128];

        char [] chars = str1.toCharArray();
        for (char c : chars)
        {
            charCount[c]++;
        }

        char [] chars2 = str2.toCharArray();
        for (char c: chars2)
        {
            if (charCount[c] == 0)
                return false;
            charCount[c]--;
        }
        return true;
    }


    public static void main(String[] args) {
        if (isPermutationV3("Eyb", "Bye"))
            System.out.println("Permutation of one another.");
        else
            System.out.println("Not Permutation.");
    }
}
