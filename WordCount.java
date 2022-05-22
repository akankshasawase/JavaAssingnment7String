/*How do you count the number of words in String? (solution)
Write a program to count a number of words in a given String. The words are separated by the following characters: 
space (‘ ‘) or newline (‘\n’) or tab (‘\t’) or a combination of these. For example, if input "Java is great" your 
program should print 3.*/
package StringInterview;

public class WordCount {
	  static final int OUT = 0;
	    static final int IN = 1;
	      
	    static int countWords(String str)
	    {
	        int state = OUT;
	        int wc = 0;  // word count
	        int i = 0;
	         
	        while (i < str.length())
	        {
	            if (str.charAt(i) == ' ' || str.charAt(i) == '\n'
	                    || str.charAt(i) == '\t')
	                state = OUT;
	            else if (state == OUT)
	            {
	                state = IN;
	                ++wc;
	            }
	      
	            
	            ++i;
	        }
	        return wc;
	    }
	      
	    
	    public static void main(String args[])
	    {
	        String str = "One two       three\n four\tfive  ";
	        System.out.println("No of words : " + countWords(str));
	    }

}
