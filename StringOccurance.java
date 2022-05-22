/*1) How to find the maximum occurring character in a given String? (solution)
Write an efficient Java/C/Python program to return the maximum occurring character in the input string,
e.g., if the input string is "Java" then the function should return 'a'.*/
package StringInterview;

public class StringOccurance {

		static final int ASCII_SIZE = 256;
	    static char getMaxOccurringChar(String str)
	    {
	        
	        int count[] = new int[ASCII_SIZE];
	     
	        int len = str.length();
	        for (int i=0; i<len; i++)
	            count[str.charAt(i)]++;
	      
	        int max = -1;  
	        char result = ' ';   
	      
	        for (int i = 0; i < len; i++) 
	        {
	            if (max < count[str.charAt(i)])
	            {
	                max = count[str.charAt(i)];
	                result = str.charAt(i);
	            }
	        }
	      
	        return result;
	    }
	     
	    public static void main(String[] args)
	    {
	        String str = "Java";
	        System.out.println("Max occurring character is " +
	                            getMaxOccurringChar(str));

	}

}
