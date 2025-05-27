class Nonstatic
{
	void show(int x)
	{
		System.out.println("x:"+x);
	}
	void display()
	{
		System.out.println("Krishna");
	}
	public static void main(String[] args) 
	{
		Nonstatic ob=new Nonstatic();
		ob.show(10);
		ob.display();
	}
}
