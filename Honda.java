abstract class Bike
{
	abstract void run();
	
}
class Honda extends Bike
{
	void run()
	{
		System.out.println("Honda is the outstanding bike");
	}
	public static void main(String[] args)
	{
		Bike ob=new Honda();//Upcasting
		ob.run();
	}
}
