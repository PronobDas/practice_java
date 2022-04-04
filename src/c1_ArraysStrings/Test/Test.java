package c1_ArraysStrings.Test;

import java.util.*;

public class Test {
    // Non repeating char index
    public static int getIndex(String str)
    {
        for (int i = 0; i < str.length(); i++)
        {
            boolean flag = true;
            for (int j = 0; j < str.length(); j++)
            {
                if (i != j && str.charAt(i) == str.charAt(j))
                {
                    flag = false;
                    break;
                }
            }
            if (flag)
                return i;
        }
        return -1;
    }


    public static void printDuplicates(int [] arr)
    {
        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                if (i != j && arr[i] == arr[j])
                {
                    set.add(arr[i]);
                    break;
                }
            }
        }
        System.out.println(set);
    }

    public static ArrayList<Integer> sum(int[] arr, int n)
    {
        int num = 0;
        for (int i = arr.length - 1; i >=0; i--)
        {
            num += Math.pow(10, (arr.length - i - 1)) * arr[i];
        }
        System.out.println(num);
        num += n;

        ArrayList<Integer> ret = new ArrayList<>();
        while (num != 0)
        {
            ret.add(0, num%10);
            num = num /10;
        }
        return ret;
    }


    public static void makeFirstLetterUpperCase(String str)
    {
        String words[] = str.split(" ");
        for (int i = 0; i < words.length; i++)
        {
            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
        }

        String sentence = "";
        for (String word: words)
        {
            if (sentence != "")
                sentence += " ";
            sentence += word;
        }

        System.out.println(sentence);
    }

    public static boolean isSame(String str1, String str2)
    {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < str1.length(); i++)
        {
            if (hashMap.containsKey(str1.charAt(i)))
                hashMap.put(str1.charAt(i), hashMap.get(str1.charAt(i))+ 1);
            else
                hashMap.put(str1.charAt(i), 1);
        }

        for (int i = 0; i < str2.length(); i++)
        {
            if (hashMap.containsKey(str2.charAt(i)))
            {
                hashMap.put(str2.charAt(i), hashMap.get(str2.charAt(i))- 1);
                if (hashMap.get(str2.charAt(i)) < 0)
                    return false;
            }
            else
                return false;
        }
        return true;
    }

    public static double avg(int [] numbers)
    {
        int sum = 0;
        int largest = numbers[0];
        int smallest = numbers[0];

        int nLargest = 0;
        int nSmallest = 0;

        for (int i = 0; i < numbers.length; i++)
        {
            sum += numbers[i];

            if (numbers[i] >= largest)
            {
                if (numbers[i] == largest)
                    nLargest += 1;
                else
                    nLargest = 1;
                largest = numbers[i];
            }
            if (numbers[i] <= smallest)
            {
                if (numbers[i] == smallest)
                    nSmallest += 1;
                else
                    nSmallest = 1;
                smallest = numbers[i];
            }
        }

//        System.out.println(sum);
//        System.out.println(nLargest);
//        System.out.println(largest);
//        System.out.println(nSmallest);
//        System.out.println(smallest);
//        System.out.println(sum - nLargest*largest - nSmallest*smallest);
//        System.out.println(numbers.length - nLargest - nSmallest);

        double avg = (double)(sum - nLargest*largest - nSmallest*smallest) / (numbers.length - nLargest - nSmallest);
        return avg;
    }

    public static void main(String[] args) {
        System.out.println(getIndex("abnnjcdebacde"));

        int [] arr = new int[] {1, 2, 3, 4};
        printDuplicates(arr);

        System.out.println(sum(arr, 12));

        makeFirstLetterUpperCase("hello World. I am Pronob das.");

        System.out.println(isSame("Hello", "hello"));

        System.out.println(avg(arr));
    }
}
