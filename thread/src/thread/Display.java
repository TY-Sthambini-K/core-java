package thread;

public class Display {
public synchronized void wish(String name,int id) {
	for(int i=0;i<5;i++) {
		System.out.println("good");
		System.out.println(name);
		System.out.println(id);
	}try {
		Thread.sleep(5000);
	}catch(InterruptedException e) {
		System.out.println("exception");
	}
}
}
