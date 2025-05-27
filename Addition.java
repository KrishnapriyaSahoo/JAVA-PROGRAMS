import java.io.*;
class  Addition
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first number ");
		float num1=Float.parseFloat(br.readLine());
		System.out.println("Enter second number");
		float num2=Float.parseFloat(br.readLine());
		float sum=num1+num2;
		System.out.println("The sum of the numbers is "+sum);
	}
}
