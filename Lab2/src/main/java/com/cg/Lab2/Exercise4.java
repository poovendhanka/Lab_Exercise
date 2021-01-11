//TDD
/**
 * a method which accepts an integer array 
 * and removes all the duplicates in the array. 
 * Return the resulting array in descending order
 * @author Poovendhan
 *
 */

package com.cg.Lab2;
import java.util.*;
public class Exercise4 {

public static int removeDupl(int arr[] ){  
	        
	if(arr.length==0)
		return 0;
	         int n=arr.length;
	        int[] temp = new int[n];  
	        int j = 0;  
	        //Removing the Duplicates By Checking them one after another.
	        for (int i=0; i<n-1; i++){  
	            if (arr[i] != arr[i+1]){  
	                temp[j++] = arr[i];  
	            }  
	         }  
	        
	        temp[j++] = arr[n-1];     
	        for (int i=0; i<j; i++){  
	            arr[i] = temp[i];  
	        }  
	         return j;  
	    }  
	       
public static int getArray(int[] arr)
{
	 
	Scanner Sc = new Scanner(System.in);
	
    int n=arr.length;
    System.out.println("Enter the elements in array : ");
    for (int i = 0; i < n; i++) 
    {
        arr[i] = Sc.nextInt();
    }  
    return n;
}
       
	    public static void main (String[] args) {
	    	
	    	 Scanner Sc = new Scanner(System.in);
	    	    
	    	    System.out.print("Enter number of elements : ");
	    	   int n = Sc.nextInt();
	    	   int arr[] = new int[n];
	    	    getArray(arr);
	    	    
	        
	        int length = n; 
	        //sorting the Array in Ascending order
	        Arrays.sort(arr);
	        Arrays.toString(arr);
	        
	        length = removeDupl(arr);  
	        System.out.print("Duplicate Removed and Sorted Array \n"); 
	        int temp=0;
	        for (int index1=0; index1<length; index1++)  {
	        	 for (int index2=index1+1; index2<length; index2++)  {
	        		 if(arr[index1]<arr[index2])
	        		 {
	        			 temp=arr[index1];
	        			 arr[index1]=arr[index2];
	        			 arr[index2]=temp;
	        		 }
	         }
	       }
	        
	        for (int in=0; in<length; in++)
	        	System.out.print(arr[in]+" ");
	    }
}
        

