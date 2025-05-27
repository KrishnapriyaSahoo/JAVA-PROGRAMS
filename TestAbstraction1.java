abstract class Bike
{
	Bike()
	{
		System.out.println("Bike is created");
	}
	abstract void run();
	void gearChange()
	{
		System.out.println("Running safely...");
	}
}
class Honda extends Bike
{
	void run()
	{
		System.out.println("Gear is changed");
	}
}
class TestAbstraction1
{
	public static void main(String[] args)
	{
		Bike ob=new Honda();
		ob.run();
		ob.gearChange();
	}
}
