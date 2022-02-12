package Hooks_TaggedHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

//@Before(),@Before(order=1) then order 1 tag executed (high priority) before order 0 tag
//@after(),@after(order=1) then order 0 tag executed (high priority) before  order 1 tag
public class Hooks {

	@Before
	public void beforeScenario() {
		System.out.println("This will run before the every Scenario");
	}

	@After
	public void afterScenario() {
		System.out.println("This will run after the every Scenario");
	}
	
	@Before(order = 1 )
	public void beforeScenario1() {
		System.out.println("***********Scenario starts**************");
	}

	@After(order = 1)
	public void afterScenario1() {
		System.out.println("------------Scenario ends----------------");
	}

	@Before("@First")
	public void beforeFirst() {
		System.out.println("This will run only before the First Scenario");
	}

	@Before("@Second")
	public void beforeSecond() {
		System.out.println("This will run only before the Second Scenario");
	}

	@Before("@Third")
	public void beforeThird() {
		System.out.println("This will run only before the Third Scenario");
	}

	@After("@First")
	public void afterFirst() {
		System.out.println("This will run only after the First Scenario");
	}

	@After("@Second")
	public void afterSecond() {
		System.out.println("This will run only after the Second Scenario");
	}

	@After("@Third")
	public void afterThird() {
		System.out.println("This will run only after the Third Scenario");
	}
}