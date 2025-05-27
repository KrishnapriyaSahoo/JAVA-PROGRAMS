public class SleepDemo implements Runnable 
{
	Thread t1;
	public void run()
	{
		for(int i=0;i<4;i++)
		{
			System.out.println(Thread.currentThread());
		try
			{
			Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args)throws Exception
	{
		Thread t1=new Thread(new SleepDemo());
		t1.start();
		Thread t2=new Thread(new SleepDemo());
		t2.start();
	}
}
