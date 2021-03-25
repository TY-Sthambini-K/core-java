package com.tyss.variable.thisstat;

public class Samples extends DemoSuper {
int maxSpeed=180;
void speed() {
	System.out.println("driving in a speed "+maxSpeed);
	System.out.println("driving in a speed "+super.maxSpeed);
}
}
