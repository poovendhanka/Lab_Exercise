//TDD
/**
 * method which accepts an array of integer elements
 * and return the second smallest element in the array.
 * @author Poovendhan
 *
 */
package com.cg.Lab2;
import java.util.*;
public class Exercise1 {

public static int small(int[] a)
{
	if(a.length==0)
		return 0;
	else if(a.length==1)
		return a[0];
	int  min;
	for (int i = 0; i < a.length; i++) 
    {
        for (int j = i + 1; j < a.length; j++) 
        {
            if (a[i] > a[j]) 
            {
                min = a[i];
                a[i] = a[j];
                a[j] = min;
            }
        }
    }
   
    return a[1];
}



public static void main(String[] args) {

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
    System.out.println("The Smallest element in the array is :"+small(a));
    
}

}

