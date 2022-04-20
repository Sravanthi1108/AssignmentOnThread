
public class Shop {
	private int materials;
    private boolean available = false;
    public synchronized int get()
    {
          while (available == false)
          {
                try
                {
                      wait();
                }
                catch (InterruptedException ie)
                {
                }
          }
          available = false;
          notifyAll();
          return materials;
    }
    public synchronized void put(int value)//0
    {
          while (available == true)
          {
                try
                {
                      wait();
                }
                catch (InterruptedException ie)
                {
                      ie.printStackTrace();
                }
          }
          materials = value;//0
          available = true;
          notifyAll();
    }
}



