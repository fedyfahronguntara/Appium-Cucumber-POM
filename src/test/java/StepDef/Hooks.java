package StepDef;

import BaseSetup.Setup;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Setup{
	@Before
	public void beforeScenario() {
		System.out.println("This will run before the Scenario");
		set_up();
	}
	
	@After
	public void afterScenario() {
		System.out.println("This will run after the Scenario");
		tearDown();
	}
}
