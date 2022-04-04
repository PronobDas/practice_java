package c1_ArraysStrings.allignString;

public class Solution {
    public static void alignRight(String str, int maxLen)
    {
        int d = maxLen - str.length();
        for (int i = 0; i < d; i++)
        {
            System.out.print(" ");
        }
        System.out.print(str);

        System.out.println();
    }

    public static void alignLeft(String str, int maxLen)
    {
        int i = 0;
        while (str.charAt(i) == ' ')
            i++;

        int d = maxLen - str.length() + i;
        for (int j = i; j < str.length(); j++)
        {
            System.out.print(str.charAt(j));
        }

        for (int j = 0; j < d; j++)
        {
            System.out.print(".");
        }
        System.out.println();
    }

    public static void alignCenter(String str, int maxLen)
    {
        int d = maxLen - str.length();
        for (int i = 0; i < d/2; i++)
        {
            System.out.print(" ");
        }
        System.out.print(str);

        for (int i = d/2; i < d; i++)
        {
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        alignRight("Hello", 10);
        alignRight("World", 10);
        alignRight("Bye", 10);
        alignRight("See You", 10);

        System.out.println();

        alignCenter("Hello", 10);
        alignCenter("World", 10);
        alignCenter("Bye", 10);
        alignCenter("See You", 10);

        System.out.println();

        alignLeft("    Hello", 10);
        alignLeft("  World", 10);
        alignLeft("   Bye", 10);
        alignLeft("  See You", 10);
    }
}
