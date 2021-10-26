package c1_ArraysStrings.p1_4_PalindromePermutation;

public class SolutionV2 {
    public static boolean isPermutationOfPalindrome(String str){
        str.toLowerCase();

        int [] charCount = new int['z' - 'a' + 1];
        int oddCount = 0;
        for (char c: str.toCharArray())
        {
            if (c >= 'a' && c <= 'z')
            {
                charCount[c - 'a']++;
                if (charCount[c - 'a'] %2 == 0)
                    oddCount--;
                else
                    oddCount++;
            }
        }
        return oddCount <= 1;
    }

    public static void main(String[] args) {
        System.out.println(isPermutationOfPalindrome("ta c c ghghat"));
    }
}

