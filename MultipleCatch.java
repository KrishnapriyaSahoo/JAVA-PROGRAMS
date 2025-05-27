class MultipleCatch 
{
	public static void main(String[] args) 
	{
		try
		{
			int arr[]=new int[5];
			arr[7]=30/0;
		}
		catch(ArithmeticException a)
        {

		System.out.println("ArithmeticException occurs");
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("ArrayIndexOutOfBoundsException occurs");
		}
		catch(Exception a)
		{
			System.out.println("Parent Exception occurs");
		}
		System.out.println("Krishnapriya Sahoo");
	}
}
