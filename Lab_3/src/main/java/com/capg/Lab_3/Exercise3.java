package com.capg.Lab_3;
/**
	 * Create a method which accepts a String and 
	 * replaces all the consonants in the String with the next alphabet 
	 * @author Poovendhan
	 *
	 */

import java.util.*;
public class Exercise3 {

	public static String replaceConsonants(String str)
    {
		if(str=="")
			return null;
           StringBuffer sbr = new StringBuffer(str);
           for(int i=0;i<str.length();i++)
           {
                  char c = sbr.charAt(i);
                  if(!(c == 'A' || c =='a' || c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u'||c=='E'||c=='e'))
                  {
                        sbr.replace(i,i+1,(String.valueOf((char)c+1)));
                  }
           }
           return sbr.toString();
    }
    public static void main(String[] args)
    {
          Scanner sc = new Scanner(System.in);
           System.out.println("Enter a string");
           String str = sc.next();
           System.out.println(replaceConsonants(str));
    }
}
