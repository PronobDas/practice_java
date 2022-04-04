package c1_ArraysStrings.isSubSequent;

public class Solution {
    public static boolean isSubsequent(int[] arr1, int[] arr2)
    {
        int index = 0;
        for(int i = 0; i < arr2.length; i++)
        {
            for (int j = index; j < arr1.length; j++)
            {
                if ( arr2[i] == arr1[j])
                {
                    index = j;
                    break;
                }
                if (j == arr1.length - 1)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4};
        int b[] = { 4, 6};

        System.out.println( isSubsequent(a, b));
    }
}
