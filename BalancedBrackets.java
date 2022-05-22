/*How do you check if a given string contains valid parentheses? (solution)
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', write a function in Java or C++ to 
check if the input string is valid. The brackets must close in the correct order, "()" and "()[]{}" are all valid but
 "(]" and "([)]" are not*/
package StringInterview;

public class BalancedBrackets {
	public static boolean isBalanced(String exp)
	{
	     
	    boolean flag = true;
	    int count = 0;
	     
	    for(int i = 0; i < exp.length(); i++)
	    {
	        if (exp.charAt(i) == '(')
	        {
	            count++;
	        }
	        else
	        {
	             
	          count--;
	        }
	        if (count < 0)
	        {
	            flag = false;
	            break;
	        }
	    }
	    
	     
	    if (count != 0)
	    {
	        flag = false;
	    }
	    return flag;
	   
}
	public static void main(String[] args)
	{
	    String exp1 = "((()))()()";
	     
	    if (isBalanced(exp1))
	        System.out.println("Balanced");
	    else
	        System.out.println("Not Balanced");
	     
	    String exp2 = "())((())";
	     
	    if (isBalanced(exp2))
	        System.out.println("Balanced");
	    else
	        System.out.println("Not Balanced");
	}
}
	

	

