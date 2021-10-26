package c1_ArraysStrings.p1_4_PalindromePermutation;

public class Solution {
    public static boolean isPalindrome(String str){
        for (int i = 0; i <= str.length()/2; i++)
        {
            if ( !(str.charAt(i) == str.charAt(str.length()-i-1)))
                return false;
        }
        return true;
    }

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

    public static void main(String[] args) {
        System.out.println(isPermutationOfPalindrome("tom cat"));
    }
}
