/*How to remove characters from the first String which are present in the second String? 
 * Write an efficient Java/c/Python function that takes two strings as arguments and removes the characters from the 
 * first string, which are present in the second string. For example, if the first String "India is great" and the 
 * second String is "in" then the output should be "da s great"*/

 package StringInterview;

import java.util.Arrays;

public class TwoStringRemoveDuplicateChar {
	 public static void main(String[] args) {
	        String s = "Java";
	        String s1 = "JavaScript";
	        char[] ss = s.toCharArray();
	        char[] ss1 = s1.toCharArray();

	        for(int i=0;i<ss.length;i++){
	          for(int j=0;j<ss1.length;j++){
	                if(ss1[j] == ss[i]){
	                    ss1[j] = ' '; //Replace the common char with space
	                }
	            }
	         }
	        System.out.println(Arrays.toString(ss1));
	    }

}
