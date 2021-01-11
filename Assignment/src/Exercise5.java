/**
	 * calculate the sum of first n natural numbers which are divisible by 3 or 5.
	 * @author Poovendhan
	 *
	 */
import java.util.*;
class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		
		System.out.println("sum of first n natural numbers which are divisible by 3 or 5 are "+sum(n));
	
	
	}
		
	
	
	
	public static int sum(int n) {
		int sum=0;
		for(int i=0;i<=n;i++)
		{
			if(i%3 == 0 || i%5==0)
			{
				sum=sum+i;
			}
		}
		return sum;
		}
	

}
