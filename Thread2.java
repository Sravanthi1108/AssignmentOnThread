
public class Thread2 extends Thread           //Stop thread execution with ctrl+c

{
    String msg = "";
    Thread2(String msg)
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
                   Thread.sleep(400);
              }
         }
         catch (Exception ex)
         {
              ex.printStackTrace();
         }

}
    }
