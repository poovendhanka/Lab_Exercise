
/**
	 * Create a method that accepts a String and checks if it is a positive string.
	 *  A string is considered a positive string, if on moving from left to right each character 
	 *  in the String comes after the previous characters in the Alphabetical order. 
	 *  For Example: ANT is a positive String (Since T comes after N and N comes after A). 
	 *  The method should return true if the entered string is positive.

	 * @author Poovendhan
	 *
	 */
package com.capg.Lab_3;
import java.util.*;
public class Exercise6 {
	
	private static String checkStringPositive(String str)
	{
		int len = str.length();
		char []array1=str.toCharArray();
		for(int i=0;i<len-1;i++)
		{
			if(array1[i]>array1[i+1])
				System.out.print("Negative");
		}
		System.out.print("Positive");
		return str;
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String to be Checked: ");
    String str=sc.next();
    int len=str.length();
    System.out.println("Given String is:");
    checkStringPositive(str);
    	
    
    	
}
}
