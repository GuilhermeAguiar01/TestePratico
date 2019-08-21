package br.com.newtours.testePraticoWeb.config;

import org.openqa.selenium.By;

public class utils extends config {
	
		public static void clicar(By arg) {
			getDriver().findElement(arg).click();
	}
		
		public static void escrever(By arg, String txt) {
			getDriver().findElement(arg).sendKeys(txt);
		}
		
}
