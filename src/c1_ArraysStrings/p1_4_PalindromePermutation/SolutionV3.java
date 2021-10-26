package c1_ArraysStrings.p1_4_PalindromePermutation;

public class SolutionV3 {
    public static boolean isPermutationOfPalindrome(String str)
    {
        str.toLowerCase().replace(" ","");

        int bitVector = createBitVector(str);

        return  (bitVector & (bitVector - 1)) == 0;
    }

    public static int createBitVector(String str)
    {
        int bitVector = 0;
        for (char c: str.toCharArray())
        {
            int x = c;
            // toggling the bits
            int mask = 1 << x;
            if ((bitVector & mask) == 0)
                bitVector |= mask;
            else
                bitVector &= ~mask;
        }
        return bitVector;
    }

    public static void main(String[] args) {
        System.out.println(isPermutationOfPalindrome("heeHllh"));
    }
}
