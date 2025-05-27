class A3 implements Runnable
{
	public void run()
	{
		System.out.println("in run() method"+Thread.currentThread());
	}
}
class A4
{
	public static void main(String[] args) 
	{
		A3 a=new A3();
		A3 b=new A3();
		Thread t1=new Thread(a,"Newthread1");
		t1.setPriority(3);
		Thread t2=new Thread(b,"Newthread2");
		t2.setPriority(1);
		System.out.println("Priority of Thread:"+t1.getPriority());
		System.out.println("Name of Thread:"+t1.getName());
		System.out.println("Priority of Thread:"+t2.getPriority());
		System.out.println("name of Thread:"+t2.getName());
		t1.start();
		t2.start();
	}
}
