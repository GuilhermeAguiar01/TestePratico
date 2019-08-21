package br.com.newtours.testePraticoWeb.config;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class beforeAfter {

	config config = new config();

	@Before
	public void setUp() {
		
	}

	@After
	public void fechaNavegador() {
		config.driver.quit();
	}
}
