import java.lang.*;
public class YieldDemo implements Runnable
{
	public void run()
	{
		System.out.println("Started "+Thread.currentThread());
		Thread.yield();
		System.out.println("Ended "+Thread.currentThread());
	}
	public static void main(String[] args)
	{
		YieldDemo y1=new YieldDemo();
		Thread t1=new Thread(y1,"First Child Thread");
		YieldDemo y2=new YieldDemo();
		Thread t2=new Thread(y2,"Second Child Thread");
		t1.start();
		t2.start();
	}
}
