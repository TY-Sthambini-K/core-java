package thread;

public class Thread1 extends Thread{

	@Override
	public void run() {
		Thread.yield();
		
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println("child class");
		}
	}
	

}
