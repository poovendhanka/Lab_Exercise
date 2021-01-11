/**
	 * a Java program that reads a line of integers 
	 * and then displays each integer and the sum of all integers
	 * @author Poovendhan
	 *
	 */
package com.capg.Lab_3;
import java.util.*;
public class Exercise1 {

	public static int sum(String s) {
		int n;
        int sum = 0;
		StringTokenizer st = new StringTokenizer(s, " ");
        while (st.hasMoreElements()) {
            String temp = st.nextToken();
            n = Integer.parseInt(temp);
            System.out.println(n);
            sum = sum + n;
        }
		return sum;
	}
	public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integers :");
        String s = sc.nextLine();
        
        System.out.println("sum of the integers is: " + sum(s));
        sc.close();
    }
	}


