/*How do you check if a given String is Palindrome or not? (solution)
Write an efficient program in your favorite programming language to check if a Given a string is a palindrome, 
considering only alphanumeric characters and ignoring cases. For example,"121" is a palindrome, but "123" is not. 
Your function should return true if given String is a palindrome, false otherwise*/
package StringInterview;



public class PalimdrumString 
	{
		public static void main(String[] args) {  
	        String str = "nitin";  
	        boolean flag = true;  
	          str = str.toLowerCase();  
	          
	        
	        for(int i = 0; i < str.length()/2; i++)
	        {  
	            if(str.charAt(i) != str.charAt(str.length()-i-1))
	            {  
	                flag = false;  
	                break;  
	            }  
	        }  
	        if(flag)  
	            System.out.println("Given string is palindrome");  
	        else  
	            System.out.println("Given string is not a palindrome");  
	    }  

}
