/*How to reverse String without recursion? (solution)
Same as the previous program, but you cannot use recursion, this time, you must solve this problem in C/Java/Python
 using iteration or loops*/
package StringInterview;

public class ReverseStrigwithotRecursion {
	public class ReverseString {
		 public static void main(String[] args) {  
		        String string = "abcd";   
		        String reversedStr = "";  
		          
		          
		        for(int i = string.length()-1; i >= 0; i--){  
		            reversedStr = reversedStr + string.charAt(i);  
		        }  
		          
		        System.out.println("Original string: " + string);  
		        
		        System.out.println("Reverse of given string: " + reversedStr);  
		    }  

}
}
