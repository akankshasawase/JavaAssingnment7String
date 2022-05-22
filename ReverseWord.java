/* How to reverse the words in a given String sentence? (solution)
Write an efficient program in Java or C++ to reverse the words in a given String sentence. For example, if the input 
is "Java is best," then your program should print "best is Java". There is no restriction on preserving white space.*/

package StringInterview;

public class ReverseWord {
	public static void main(String args[]) {
	      String s[] = "Java is best".split(" "); 
	      String ans = ""; 
	      for (int i = s.length - 1; i >= 0; i--) { 
	        ans += s[i] + " "; 
	      } 
	      System.out.println("Reversed String: " + ans); 
	    }

}
