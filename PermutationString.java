/*How to print all permutation of a String? (solution)
Write an efficient program to print all permutations of a given String in Java/C/Python or any programming language of
 your choice. For example, if given input is "123" then your program should print all 6 permutations e.g. "123", "132",
  "213", "231", "312" and "321".*/
package StringInterview;

import java.util.Scanner;

public class PermutationString {
	static void permute(String s , String answer)
	{  
	    if (s.length() == 0)
	    {
	        System.out.print(answer + "  ");
	        return;
	    }
	     
	    for(int i = 0 ;i < s.length(); i++)
	    {
	        char ch = s.charAt(i);
	        String left_substr = s.substring(0, i);
	        String right_substr = s.substring(i + 1);
	        String rest = left_substr + right_substr;
	        permute(rest, answer + ch);
	    }
	}
	 
	// Driver code
	public static void main(String args[])
	{
	    Scanner scan = new Scanner(System.in);
	    String s;
	    String answer="";
	     
	    System.out.print("Enter the string : ");
	    s = scan.next();
	     
	    System.out.println(" All possible strings are : ");
	    permute(s, answer);
	}
	     

}
