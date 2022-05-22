/*How to check if two given String is the anagram of each other? (solution)
Write an efficient program in Java/C/C++ to check if two String is an anagram of each other. An anagram contains are of 
the same length and contains the same character, but in a different order, for example, "Army" and "Mary" is the anagram. 
Your program should return true if both Strings are the anagram, false otherwise*/
package StringInterview;

import java.util.Arrays;

public class AnagramString {
	public static void main(String[] args) {
	    String str1 = "Army";
	    String str2 = "Mary";
	    
	    str1 = str1.toLowerCase();
	    str2 = str2.toLowerCase();

	    
	    if(str1.length() == str2.length()) {

	      
	      char[] charArray1 = str1.toCharArray();
	      char[] charArray2 = str2.toCharArray();

	     
	      Arrays.sort(charArray1);
	      Arrays.sort(charArray2);

	     
	      boolean result = Arrays.equals(charArray1, charArray2);
	      if(result) {
	          System.out.println(str1 + " and " + str2 + " are anagram.");
	        }
	        else {
	          System.out.println(str1 + " and " + str2 + " are not anagram.");
	        }
	      }
	      else {
	        System.out.println(str1 + " and " + str2 + " are not anagram.");
	      }

}
}
