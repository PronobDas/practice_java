package c1_ArraysStrings.p1_6_StringCompression;

public class Solution {
    public static String compress(String str){
        String compressedStr = "";

        char [] chars = str.toCharArray();
        int i = 0;
        while (i < chars.length) {
            char temp = chars[i];
            int count = 1;
            while (i < chars.length-1 && chars[i + 1] == temp) {
                count++;
                i++;
            }
            compressedStr += Character.toString(temp) + Integer.toString(count);
            i++;
        }

        if (compressedStr.length() < str.length())
            return compressedStr;
        return str;
    }

    public static void main(String[] args) {
        System.out.println(compress("aabcccccaaa"));
    }
}
