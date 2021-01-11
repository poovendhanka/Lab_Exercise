/**
	 *to check if a number is a power of two or not
	 * @author Poovendhan
	 *
	 */
import java.util.*;
public class Exercise8 {
	static boolean power(int n)
    {
        while (n != 1)
        {
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }
        return true;
    }
 
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	
        if (power(n))
            System.out.println("Yes");
        else
            System.out.println("No");
 
       
    }
}
