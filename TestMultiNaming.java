class TestMultiNaming extends Thread
{
	public void run()
	{
		System.out.println("running..."+Thread.currentThread());
	}
	public static void main(String[] args)
	{
		TestMultiNaming t1=new TestMultiNaming();
		TestMultiNaming t2=new TestMultiNaming();
		System.out.println("Name of:"+t1.getName());
		System.out.println("Name of:"+t2.getName());
		t1.start();
		t2.start();
		t1.setName("Subhasis Mohapatra");
		System.out.println("After changing name of "+t1.getName());
	}
}
