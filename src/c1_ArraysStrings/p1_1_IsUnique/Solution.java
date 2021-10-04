package c1_ArraysStrings.p1_1_IsUnique;

import java.util.Arrays;

public class Solution {

    static boolean isUniqueChars(String str){
        // we have assumed that the string is in ASCII, that means only 128 characters possible.
        // If the string is more than 128 char, then it is obviously not unique.
        // Assuming 256 is also okay.

        if (str.length() > 128)
            return false;

        int arr[] = new int[128];
        for (int i = 0; i < str.length(); i ++)
        {
            int asciiValue = str.charAt(i);
            if (arr[asciiValue] == 1)
                return false;
            else
                arr[asciiValue] = 1;
        }
        return true;
    }

    // If not allowed to use any other ds
    public static boolean isUniqueCharsV2(String str){
        for (int i = 0; i < str.length(); i++)
            for (int j = i+1; j < str.length(); j++)
            {
                if (str.charAt(i) == str.charAt(j))
                    return false;
            }
        return true;
    }

    public static boolean isUniqueCharsV3(String str){
        char [] chars = str.toCharArray();
        Arrays.sort(chars);

        for (int i = 0; i < chars.length-1; i++)
            if (chars[i] == chars[i+1])
                return false;
        return true;
    }



    // Driver Code
    public static void main(String[] args) {

        if( isUniqueCharsV3("String") )
            System.out.println("Unique");
        else
            System.out.println("Not Unique");
    }
}