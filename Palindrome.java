class Palindrome 
{
	int palin(int num)
	{
		int rem,rev=0;
		int num1=num;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
	}
		public static void main(String[] args) 
	{
			int num2=1221;
			//int rev=0;
			Palindrome ob=new Palindrome();
			ob.palin(num1);
			if(num1==rev)
		System.out.println(num1+" is a palindrome");
			else
				System.out.println(num1+" is not a palindrome");
	}
}
