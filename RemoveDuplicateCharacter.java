/*2) How to remove all duplicates from a given string? (solution)
Write a program to remove all the duplicate characters from a given input String, like, if the given String is "Java" 
then the output should be "Java".The second or further occurrence of duplicates should be remove*/
package StringInterview;

import java.util.Arrays;

public class RemoveDuplicateCharacter {
	static String removeDuplicate(char str[], int n)
    {
         int index = 0;
 
        for (int i = 0; i < n; i++)
        {
 
             int j;
            for (j = 0; j < i; j++)
            {
                if (str[i] == str[j])
                {
                    break;
                }
            }
 
            if (j == i)
            {
                str[index++] = str[i];
            }
        }
        return String.valueOf(Arrays.copyOf(str, index));
    }
 
   public static void main(String[] args)
    {
        char str[] = "Java".toCharArray();
        int n = str.length;
        System.out.println(removeDuplicate(str, n));
    }
}


