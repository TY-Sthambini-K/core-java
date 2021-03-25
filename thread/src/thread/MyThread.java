package thread;

public class MyThread extends Thread{
int id;
String name;
Display d1;
public MyThread(int id, String name,Display d1) {
	super();
	this.id = id;
	this.name = name;
	this.d1=d1;
	System.out.println("details "+id+" "+name);
}

@Override
public void run() {
	// TODO Auto-generated method stub
	d1.wish(name,id);
}

}
