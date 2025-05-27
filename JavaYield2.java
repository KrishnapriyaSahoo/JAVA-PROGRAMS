public class JavaYield2 extends Thread
{
	public void run()
	{
		for(int i=0;i<3;i++)
			System.out.println(Thread.currentThread().getName());
	}
	public static void main(String args[])
	{
		JavaYield2 t1=new JavaYield2();
		JavaYield2 t2=new JavaYield2();
		t1.start();
		t2.start();
		for(int i=0;i<3;i++)
		{
			t1.yield();
			System.out.println(Thread.currentThread().getName());
		}
	}
}
