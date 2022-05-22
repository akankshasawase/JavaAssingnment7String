/*How to reverse a given String? (solution)
Write a program to reverse a String in C/Java/Python or choice of your programming language. You can write either the 
recursive or iterative solution. For example, if a given input is "abcd," then your function should return "dcba".*/
package StringInterview;

public class ReverseString {
	//using recursion
	
		 void reverse(String str)
		    {
		        if ((str==null)||(str.length() <= 1))
		           System.out.println(str);
		        else
		        {
		            System.out.print(str.charAt(str.length()-1));
		            reverse(str.substring(0,str.length()-1));
		        }
		    }
		     
		    /* Driver program to test above function */
		    public static void main(String[] args)
		    {
		        String str = "shivani";
		        ReverseString obj = new ReverseString();
		        obj.reverse(str);
		    }   

}
