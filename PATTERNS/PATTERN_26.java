package patterns;
import java.util.Scanner;
public class PATTERN_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int n1=(n+1)/2;
		int n2=n/2;
		int i=1;
		while(i<=n1)
		{
		    int spaces = 1;
		    while(spaces<=n1-i)
		    {
		        System.out.print(" ");
		        spaces=spaces+1;
		    }
		    int stars=1;
		    while(stars<=2*i-1)
		    {
		        System.out.print("*");
		        stars=stars+1;
		    }
		    System.out.println();
		    i=i+1;
		}
		i=n2;
		while(i>=1)
		{
		    int spaces = 1;
		    while(spaces<=n2-i+1)
		    {
		        System.out.print(" ");
		        spaces=spaces+1;
		    }
		    int stars=1;
		    while(stars<=2*i-1)
		    {
		        System.out.print("*");
		        stars=stars+1;
		    }
		    System.out.println();
		    i=i-1;
		}
		s.close();
	}
	}


/* 			 *
 			***
 		   *****
            ***
             *
*/
