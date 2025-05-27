class Constructor 
{
	int y;
	char a;
	satic Constructor(int x,char c)
	{
		int y=x;
		char a=c;
	}
	void show()
	{
		System.out.println(y+" "+a);
	}
}
class Constructor1
{
	public static void main(String[] args)
	{
	Constructor pb=new Constructor(10,'A');
	pb.show();
}
}