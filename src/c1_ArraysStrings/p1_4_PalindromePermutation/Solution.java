package c1_ArraysStrings.p1_4_PalindromePermutation;

public class Solution {
    public static boolean isPermutationOfPalindrome(String str){
        int [] charCount = getCharCounts(str);
        boolean firstOdd = false;
        for (int count: charCount)
        {
            if (count%2 == 1)
            {
                if (firstOdd)
                    return false;
                firstOdd = true;
            }
        }
        return true;
    }

    public static int [] getCharCounts(String str){
        int [] charCount = new int['z' - 'a' + 1];
        for (char c: str.toCharArray())
        {
            if (c >= 'a' && c <= 'z')
                charCount[c - 'a']++;
        }
        return charCount;
    }




    // Merged function of the above two
    public static boolean isPermutationOfPalindromeV2(String str){
        int [] charCount = new int['z' - 'a' + 1];
        for (char c: str.toCharArray())
        {
            if (c >= 'a' && c <= 'z')
                charCount[c - 'a']++;
        }

        boolean firstOdd = false;
        for (int count: charCount)
        {
            if (count%2 == 1)
            {
                if (firstOdd)
                    return false;
                firstOdd = true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPermutationOfPalindrome("toma cat"));
    }
}
