
package chapter;
import java.util.Scanner;
public class Project 
{

	public static void main(String[] args)
	{
		System.out.println("Enter in an integer");
		Scanner scan = new Scanner(System.in);
		int input =scan.nextInt();
		int even=0, odd=0, zero=0;
		while(input>0)
		{
			if(input%10==0)
			{
				zero++;
			}
			else if(input%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
			input /= 10;
		}
		System.out.println("There are "+ zero + " zero's, " + even + " even's and " + odd + " odd's.");
	}

}
