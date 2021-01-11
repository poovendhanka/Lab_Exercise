package com.cg.Lab2;
/**
	 *: Create a method which accepts an integer array, 
	 *reverse the numbers in the array and returns the 
	 *resulting array in sorted order.
	 * @author Poovendhan
	 *
	 */
import java.util.*;
public class Exercise3 {

	
	

	public static int[] rev(int[] a,int n) {
		
		Arrays.sort(a);
        Arrays.toString(a);
        System.out.print("sorted arr[] :");
        for(int i=0;i<n;i++)
        System.out.print(" "+a[i]);
        
		int r[]=new int[n],digit  ;
 	    for (int j = 0; j <= a.length-1; j++) {
 	    	
 	    	while(a[j]!= 0) 
 	    	{
 	            digit=a[j] % 10;
 	            r[j] = r[j] * 10 +digit ;
 	            a[j] /= 10;
 	    	}
    }
 	   System.out.print("Reversed arr[] :");
         for(int i=0;i<n;i++)
         System.out.print(" "+r[i]);
	    return r;
	  }  
	
	  
	    public static void main(String[] args) 
	    { 
	    	 int n;
	         Scanner Sc = new Scanner(System.in);
	         
	         System.out.print("Enter number of elements : ");
	         n = Sc.nextInt();
	         
	         int a[] = new int[n];
	         
	         System.out.println("Enter the elements in array : ");
	         for (int i = 0; i < n; i++) 
	         {
	             a[i] = Sc.nextInt();
	         } 
	         
	         rev(a, n);
	 	    
	    }
}

