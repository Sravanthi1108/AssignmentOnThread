
public class ProducerConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shop c = new Shop();
        Producer p1 = new Producer(c, 1);
        Consumer c1 = new Consumer(c, 1);
        p1.start();//run method producer
        c1.start();//run method consumer
  }

	}


