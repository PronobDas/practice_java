package c1_ArraysStrings.minSum;

public class Solution {
    public static int[] removeItem(int[] arr, int pos)
    {
        int[] newArr = new int[arr.length-1];
        int j = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (i == pos)
                continue;
            newArr[j] = arr[i];
            j++;
        }
        return newArr;
    }

    public static int getMinSum(int[] arr)
    {
        if (arr.length == 0)
            return 999999999;

        int minSum = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            int temp = getMinSum(removeItem(arr, i));

            if (minSum > temp)
                minSum = temp;
        }

        return minSum;
    }

    public static void main(String[] args) {

        int a[] = { -1, -2, -3, 4};
        //System.out.println(removeItem(a, 1)[1]);

        System.out.println(getMinSum(a));
    }
}
