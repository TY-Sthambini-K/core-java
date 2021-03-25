package thread;

public class TestThread {
public static void main(String[] args) {
	Display d = new Display();
	MyThread t1 = new MyThread(12, "sam", d);
	MyThread t2 = new MyThread(13, "sama", d);
	t1.start();
	t2.start();
}
}
