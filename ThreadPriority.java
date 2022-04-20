
public class ThreadPriority extends Thread
{
	public void run()
	{
		String ThreadName=Thread.currentThread().getName();
		Integer ThreadPrority=Thread.currentThread().getPriority();
		System.out.println(ThreadName+"has priority"+ThreadPrority);
	}
	public static void main(String args[])
	{
		ThreadPriority t1=new ThreadPriority();
		ThreadPriority t2=new ThreadPriority();
		ThreadPriority t3=new ThreadPriority();
		
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		t3.setPriority(NORM_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
	}

}
