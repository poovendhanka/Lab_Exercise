/**
	 * find the difference between the sum of the squares
	 *  and the square of the sum of the first n natural numbers.
	 * @author Poovendhan
	 *
	 */
import java.util.*;
public class Exercise6 {
	
	
	public static int sum(int n)
	{
		int a = 0,m=0;
		 for(int i=1;i<=n;i++)
         {
            m=i*i;
            a+=m;
         }
         System.out.println("sum of the squares of the first n natural numbers: "+a);
         int b=0,c;
         for(int j=1;j<=n;j++) 
         {
        	b+=j;
         }
         b=b*b;
         System.out.println("square of the sum of the first n natural numbers: "+b);
         b=b-a;
         return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         
         
        
         System.out.println("the difference between them: "+sum(n));
	}
	

}
