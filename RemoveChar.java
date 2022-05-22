/*How do you remove a given character from String? (solution)
Write an efficient method in Java to remove all occurrences of a given character in Java. For example, if the given 
String is "Programming" and the given character to remove is "m" then your function should return "Prograing".*/
package StringInterview;

public class RemoveChar {
	public static void main(String[] args) {  
        String str = "Programming";  
        System.out.println(charRemoveAt(str, 7));  
     }  
     public static String charRemoveAt(String str, int p) 
     {  
        return str.substring(0, p) + str.substring(p + 1);  
     }

}
