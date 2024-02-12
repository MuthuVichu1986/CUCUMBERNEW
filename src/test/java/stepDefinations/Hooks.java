package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before(order= 2, value= "@regression")
	public void setup3() {
		System.out.println("Testing is in progress");
	}
	@Before(order= 1, value= "@smoke")
	public void setup() {
		System.out.println("Testing started");
	}
	
	@After
	public void tearDown() {
		System.out.println("Testing completed");
	}
	@Before("@regression")
	public void setup1() {
		System.out.println("Testing started for regression");
	}
	@After("@smoke")
	public void tearDown1() {
		System.out.println("Testing completed for smoke");
	}

}
