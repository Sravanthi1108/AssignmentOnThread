class MyThread implements Runnable
{
	public void run()
	{
		System.out.println("thread is created");
	}
}
public class ThreadRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread myThread=new MyThread();
		Thread thread=new Thread(myThread);
		thread.start();

	}

}
