import java.io.*;
import java.util.*;
//A class is used to send a message
class Sender
{
	public void send(String msg)
	{
		System.out.println("Sending\t"+msg);
		try
		{
			Thread.sleep(1000);

		}
		catch(Exception e)
		{
			System.out.println("Thread interrupted");
		}
		System.out.println("\n"+msg+" Sent");
	}
}
class ThreadSend extends Thread
{
	private String msg;
	Sender sender;
	ThreadSend(String m,String ob)
	{
		msg=m;
		sender=ob;
	}
	public void run()
	{
		synchronised(sender)
		{
			sender.send(msg);
		}
	}
}
class SyncDemo
{
	public static void main(String[] args)
	{
		Sender send=new Sender();
		ThreadSend s1=new ThreadSend("Hi",send);
		ThreadSend s2=new ThreadSend("Hello",send);
		s1.start();
		s2.start();
		try
		{
			s1.join();
			s2.join();
		}
		catch(Exception e)
		{
			System.out.println("Interrupted");
		}
	}
}
