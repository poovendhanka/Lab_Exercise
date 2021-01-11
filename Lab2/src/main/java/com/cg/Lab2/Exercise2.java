package com.cg.Lab2;
/**
	 * Create a method that can accept an array of String objects
	 *  and sort in alphabetical order. The elements in the left half
	 *   should be completely in uppercase and the elements in the right half
	 *    should be completely in lower case
	 * @author Poovendhan
	 *
	 */
import java.util.*;
public class Exercise2 {
	
	private static String[] sortString(int n, Scanner sc) 
	    {
		
		System.out.println("Enter the Elements: ");
		String []str=new String[n];
		for(int i=0;i<n;i++)
	    str[i]=sc.next();
		Arrays.sort(str);
		return str;
	    }

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number Of Elements: ");
		int n=sc.nextInt();
		
		String []str=sortString(n,sc);
		
		int limit=0;
		if(n%2==0)
			limit=n/2;
		else if(n%2==1)
			limit=(n/2)+1;
		for(int i=0;i<limit;i++) 
		
			System.out.print(str[i].toUpperCase()+" ");
		for(int j=limit;j<n;j++)
		
			System.out.print(str[j].toLowerCase()+" ");
		
		}
	}
	
