
public class Producer extends Thread
{
    private Shop shop;
    private int number;
    //synchronization --it is a process of allowing 
    //one thread to access one resource at the same time
    
    //synchronized
    
    //synchronized block or method
    //synchronized statement

    public Producer(Shop c, int number)
    {
          shop = c;//materials=0 available=false 
          this.number = number;//1
    }
    public void run()
    {
          for (int i = 0; i < 10; i++)
          {
                shop.put(i);//0
                System.out.println("Produced value " + this.number+ " put: " + i);
                try
                {
                      sleep((int)(Math.random() * 100));
                }
                catch (InterruptedException ie)
                {
                      ie.printStackTrace();
     

}
          }}}
