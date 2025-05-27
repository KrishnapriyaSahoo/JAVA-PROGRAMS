import java.util.Scanner;
class Prime 
{
	public static void main(String[] args) 
	{
		int n,i,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check whether it is prime or not:");
		n=sc.nextInt();
		if(n==1||n==0)
		{
			System.out.println(n+ " is not a prime number");
		}
		else
		{
			for(i=2;i<n/2;i++)
			{
				if(n%i==0)
				{
					flag=0;
				break;
				}
				else
					flag=1;
			}
		}
		if(flag==1)
			System.out.println(n+ "is a prime number");
		else
			System.out.println(n+ "is not a prime number");
		
	}
}
