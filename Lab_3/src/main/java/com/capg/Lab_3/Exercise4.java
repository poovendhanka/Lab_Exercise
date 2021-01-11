/**
	 * a method that accepts a number and modifies it such that the each of the digit 
	 * in the newly formed number is equal to the difference between 
	 * two consecutive digits in the original number. 
	 * The digit in the units place can be left as it is
	 * @author Poovendhan
	 *
	 */

package com.capg.Lab_3;
import java.util.*;
public class Exercise4 {
	private static char ch;

	public static String splitAndFindDif(String str)
	{
		int a,b,dif;
		char []ch=str.toCharArray();
		int length=str.length();
		StringBuilder strb = new StringBuilder("");
		//char c;
		for(int i=0;i<length-1;i++)
		{
			a=(int)(ch[i]);
			b=(int)(ch[i+1]);
			dif=Math.abs(a-b);
			//c=(char)dif;
			System.out.print(dif+" ");
			strb=strb.append(dif);
		}
		strb.append(ch[length-1]);
		return strb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		 System.out.println("Enter a String");
         String str = sc.next();
         System.out.println(""+splitAndFindDif(str));
		
		

	}

}
