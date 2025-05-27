//WAP to reverse a string
import java.io.*;
import java.lang.*;
class Reverse 
{
	public static void main(String[] args)throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a String:");
		String s1=br.readLine();
		StringBuffer s2=new StringBuffer(s1);
		s2.reverse();
		System.out.println("Reversed String "+s2);
	}
}
