/*How do you convert String to an integer?  (solution)
Implement atoi() like function in C/C++/Java to convert a string to an integer. Consider all possible cases 
e.g. positive and negative String, the presence of + or - character, etc. For example, if the given input String is "123"
 then your program should return 123 and if a given input is "+231" then your program should return 231.*/ 
package StringInterview;

public class StringToIntconvert {
	public static void main(String args[]){  
		 
		String s="+231";  
		
		//Converting String into int using Integer.parseInt()  
		
		int i=Integer.parseInt(s);  
	
		System.out.println(i);  
		}
	}  


