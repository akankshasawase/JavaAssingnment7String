/*How to check if two strings are rotations of each other? (solution)
Write an efficient program to test if two given String is a rotation of each other or not, e.g. if the given String is 
"XYZ" and "ZXY" then your function should return true, but if the input is "XYZ" and "YXZ" then return false.*/
package StringInterview;

public class RotationString {
	static boolean areRotations(String str1, String str2)
    {
         
        return (str1.length() == str2.length()) &&
               ((str1 + str1).indexOf(str2) != -1);
    }
     
    public static void main (String[] args)
    {
        String str1 = "Nana";
        String str2 = "nana";
 
        if (areRotations(str1, str2))
            System.out.println("Strings are rotations of each other");
        else
            System.out.printf("Strings are not rotations of each other");
    }

}
