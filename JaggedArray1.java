import java.util.Scanner;
class JaggedArray1 
{
	public static void main(String[] args) 
	{
		int arr[][]=new int[3][];
		arr[0]=new int[4];
		arr[1]=new int[2];
		arr[2]=new int[3];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				Scanner sc=new Scanner(System.in);
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
		System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
