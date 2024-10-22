package swingDemo;
public class App implements Runnable{
	public static void main(String[] args) {
		Thread th = new Thread(()->{
			MainSwing mainSwing = new MainSwing();
		});
		th.start();
	}
}
