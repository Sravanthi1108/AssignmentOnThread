
public class Thread1 extends Thread    //Stop thread execution with ctrl+c
{
    String msg = "";
    Thread1(String msg)
    {
         this.msg = msg;
    }
    public void run()
    {
         try
         {
              while (true)
              {
                   System.out.println(msg);
                   Thread.sleep(300);
              }
         }
         catch (Exception ex)
         {
              ex.printStackTrace();
         }

    }
    }
