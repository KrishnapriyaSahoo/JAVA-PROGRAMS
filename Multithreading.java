public class Multithreading implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread());
	}
	public static void main(String[] args)
	{
		Multithreading a=new Multithreading();
		Thread t=new Thread(a,"NewThread");
		t.setPriority(2);
		System.out.println("Priority of Thread:"+t.getPriority());
		System.out.println("Name of Thread:"+t.getName());
		t.start();
	}
}
