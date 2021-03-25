package thread;

public class TestThread1 {
public static void main(String[] args) {
	Thread1.currentThread().setPriority(1);
	Thread1 t = new Thread1();
	t.setPriority(10);
	t.start();
	t.setDaemon(true);
	System.out.println(t.isDaemon());
	System.out.println("id"+t.getId());
	for (int i = 0; i < 3; i++) {
		System.out.println("main thread");
	}
}
}
