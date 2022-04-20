
public class RunningThread extends Thread{             //display all running threads
    public static void main(String args[])
    {
    	RunningThread runningThread =new RunningThread();
    	runningThread.setName("thread1");
    	runningThread.start();
    	ThreadGroup currentGroup = Thread.currentThread().getThreadGroup();
        int noThreads = currentGroup.activeCount();
        Thread[] lstThreads = new Thread[noThreads];
        currentGroup.enumerate(lstThreads);
        
        for (int i = 0; i < noThreads; i++) System.out.println("Thread No:" + i + " = " + lstThreads[i].getName());

    	   
    	   
    			  
    	   
    }
}
