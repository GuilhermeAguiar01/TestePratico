package br.com.newtours.testePraticoWeb.teste;

import org.openqa.selenium.By;

public class page {
	
	//Login
	public By cmpUsuario() { return By.xpath("//*[@name='userName']"); }
	
	public String usuario() {
	return "mercury";
	}
	
	public By cmpSenha() { return By.xpath("//*[@name='password']"); }
	
	public String senha() {
		return "mercury";
		}
	
	public By btnSignIn() { return By.xpath("//*[@name='login']"); }
	
	
	//
	public By cmpDepartingFrom() { return By.xpath("//*[@name='fromPort']"); }
	
	public By cmpArrivingIn() { return By.xpath("//*[@name='toPort']"); }
	
	public By cmpOnMonth() { return By.xpath("//*[@name='fromMonth']"); }
	
	public By cmpOnDay() { return By.xpath("//*[@name='fromDay']"); }
	
	public By returningMonth() { return By.xpath("//*[@name='toMonth']"); }
	
	public By returningDay() { return By.xpath("//*[@name='toDay']"); }
	
	public By classEconomy() { return By.xpath("//*[@value='Coach']"); }
	
	public By classBusiness() { return By.xpath("//*[@value='Business']"); }
	
	public By classFirst() { return By.xpath("//*[@value='First']"); }
	
	public By btnSignOff() { return By.xpath("//*[text()='SIGN-OFF']"); }
	
	public By cmpPassengers() { return By.xpath("//*[@name='passCount']"); }
	
	public By btnContinueFind() { return By.xpath("//*[@name='findFlights']"); }
	
	public By cmpAirLine() { return By.xpath("//*[@name='airline']"); }
	
	public By outFlight() { return By.xpath("(//*[@name='outFlight'])[3]"); }
	
	public By btnContinueReserve() { return By.xpath("(//*[@name='reserveFlights'])"); }
	
	public By cmpFirstNamePassangers() { return By.xpath("(//*[@name='passFirst0'])"); }
	
	public By cmpLastNamePassangers() { return By.xpath("(//*[@name='passLast0'])"); }
	
	public By cardNumber() { return By.xpath("(//*[@name='creditnumber'])"); }
	
	public By cardFirstName() { return By.xpath("(//*[@name='cc_frst_name'])"); }
	
	public By cardLastName() { return By.xpath("(//*[@name='cc_last_name'])"); }
	
	public By securePurchase() { return By.xpath("(//*[@name='buyFlights'])"); }
	
	public By flightConfirmation() { return By.xpath("(//*[@src='/images/masts/mast_confirmation.gif'])"); }

}
