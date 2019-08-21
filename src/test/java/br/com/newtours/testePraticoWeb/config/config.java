package br.com.newtours.testePraticoWeb.config;

import org.openqa.selenium.WebDriver;

import br.com.newtours.testePraticoWeb.teste.logic;
import br.com.newtours.testePraticoWeb.teste.page;

public class config {

	public static WebDriver driver;

	page page = new page();

	logic logic;

	public static WebDriver getDriver() {
		return driver;
	}
}
