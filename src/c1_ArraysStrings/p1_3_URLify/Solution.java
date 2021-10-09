package c1_ArraysStrings.p1_3_URLify;

public class Solution {
    public static String urlify(String str, int trueLen){
        String url = "";
        for (int i = 0; i < trueLen; i++)
        {
            if (str.charAt(i) == ' ')
                url += "%20";
            else
                url += str.charAt(i);
        }
        return url;
    }

    public static void urlifyV2(char[] str, int trueLen){
        int spaceCount = 0;
        for (int i = 0; i < trueLen; i++)
            if (str[i] == ' ')
                spaceCount++;

        int index = trueLen + spaceCount * 2;
        for (int i = trueLen-1; i >=0; i--)
        {
            if (str[i] == ' ')
            {
                str[index-1] = '0';
                str[index-2] = '2';
                str[index-3] = '%';

                index -= 3;
            }
            else
            {
                str[index-1] = str[i];
                index--;
            }
        }
    }

    public static void main(String[] args) {
        String url = urlify("Mr John Smith     ", 13);
        System.out.println(url);


        char [] urlChars = "Mr John Smith    ".toCharArray();
        urlifyV2(urlChars, 13);
        System.out.println(urlChars);
    }
}