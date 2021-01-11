/**
	 * a Java program that displays the number of characters, lines and words in a text
	 * @author Poovendhan
	 *
	 */
package com.capg.Lab_3;
import java.util.*;
public class Exercise5 {
	
	private static String StringCount(String str)
	{
		System.out.println("No of characters = "+str.length());
	    String []words=str.split("[ !,.]+");
	    String []lines=str.split("[\r\n]");
	    System.out.println("No of lines = "+lines.length);
	    System.out.println("No of words = "+words.length);
	    return str;
	}
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a string");
	    String str = sc.nextLine();
	   
	    //String str=" ";
	    StringCount(str);
	    
		}

}
