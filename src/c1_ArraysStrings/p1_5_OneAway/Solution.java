package c1_ArraysStrings.p1_5_OneAway;

public class Solution {

    public static boolean isOneEditAway(String str1, String str2) {
        if (str1.length() == str2.length())
            return isOneReplaceAway(str1, str2);
        else if (str1.length() - str2.length() == 1) // removal
            return isOneInsertionAway(str2, str1);
        else if (str2.length() - str1.length() == 1) // insertion
            return isOneInsertionAway(str1, str2);
        else
            return false;
    }

    private static boolean isOneInsertionAway(String str1, String str2) {
        boolean isInserted = false;
        int index1 = 0, index2 = 0;
        while (index1 < str1.length() && index2 < str2.length())
        {
            if (str1.charAt(index1) != str2.charAt(index2))
            {
                if (isInserted)                   // alt: (index1 != index2)
                    return false;
                index2++;
                isInserted = true;
            }
            else
            {
                index1++;
                index2++;
            }
        }
        return true;
    }

    private static boolean isOneReplaceAway(String str1, String str2) {
        boolean foundReplaced = false;
        for (int i = 0; i < str1.length(); i++)
        {
            if (str1.charAt(i) != str2.charAt(i)) {
                if (foundReplaced)
                    return false;
                foundReplaced = true;
            }
        }
        return true;
    }
    
    
    // Merged Solution
    public static boolean isOneEditAwayV2(String str1, String str2){
        if (Math.abs(str1.length() - str2.length()) > 1)
            return false;
        
        String s1 = str1.length() > str2.length() ? str1 : str2;
        String s2 = str1.length() < str2.length() ? str1 : str2;
        
        int index1 = 0, index2 = 0;
        boolean foundDifference = false;

        while (index1 < s1.length() && index2 < s2.length())
        {
            if (s1.charAt(index1) != s2.charAt(index2))
            {
                if (foundDifference)
                    return false;
                foundDifference = true;
                
                if (s1.length() == s2.length())
                    index1++;
            }
            else
                index1++;

            index2++;
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(isOneEditAwayV2("abcded", "abcdee"));
    }
}
