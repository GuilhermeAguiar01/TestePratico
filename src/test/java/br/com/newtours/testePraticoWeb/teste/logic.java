package br.com.newtours.testePraticoWeb.teste;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.newtours.testePraticoWeb.config.config;
import br.com.newtours.testePraticoWeb.config.utils;

public class logic extends config {
	WebDriver driver;
	page page;

	String day;
	String month;

	public logic() {
		this.driver = getDriver();
		this.page = new page();
	}

	public void abrirURL() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		config.driver = new ChromeDriver();
		config.driver.get("http://www.newtours.demoaut.com");
		config.driver.manage().window().maximize();
	}

	public void inserirNomeDeUsuario() {
		utils.escrever(page.cmpUsuario(), page.usuario());
	}

	public void inserirSenha() {
		utils.escrever(page.cmpSenha(), page.senha());
	}

	public void clicarEmSignIn() {
		utils.clicar(page.btnSignIn());
	}

	public void cmpDepartingFrom() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 120);
		wait.until(ExpectedConditions.elementToBeClickable(page.cmpDepartingFrom()));
		Select departingFrom = new Select(getDriver().findElement(page.cmpDepartingFrom()));
		departingFrom.selectByVisibleText("San Francisco");
	}

	public void cmpArrivingIn() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 120);
		wait.until(ExpectedConditions.elementToBeClickable(page.cmpArrivingIn()));
		Select arrivingIn = new Select(getDriver().findElement(page.cmpArrivingIn()));
		arrivingIn.selectByValue("Portland");
	}

	public void cmpOnMonth() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 120);
		wait.until(ExpectedConditions.elementToBeClickable(page.cmpOnMonth()));
		Select onMonth = new Select(getDriver().findElement(page.cmpOnMonth()));
		onMonth.selectByValue(month = "12");
	}

	public void cmpOnDay() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 120);
		wait.until(ExpectedConditions.elementToBeClickable(page.cmpOnDay()));
		Select onDay = new Select(getDriver().findElement(page.cmpOnDay()));
		onDay.selectByValue(day = "27");
	}

	public void cmpReturningMonth() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 120);
		wait.until(ExpectedConditions.elementToBeClickable(page.returningMonth()));
		Select returningMonth = new Select(getDriver().findElement(page.returningMonth()));
		int intMonth = Integer.parseInt(month);
		intMonth = +1;
		if (intMonth > 12) {
			intMonth = 1;
		}
		month = intMonth + "";
		returningMonth.selectByValue(month);
	}

	public void cmpReturningDay() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 120);
		wait.until(ExpectedConditions.elementToBeClickable(page.returningDay()));
		Select returningDay = new Select(getDriver().findElement(page.returningDay()));
		int intDay = Integer.parseInt(day);
		intDay = +1;
		if ((month == "1" || month == "3" || month == "5" || month == "7" || month == "9" || month == "11")
				&& intDay > 30) {
			intDay = 1;
		}
		if ((month == "2" || month == "4" || month == "6" || month == "8" || month == "10" || month == "12")
				&& intDay > 31) {
			intDay = 1;
		}
		day = intDay + "";
		returningDay.selectByValue(day);
	}

	public void validaSeLogou() {
		try {
			By byMensagem = page.btnSignOff();
			WebDriverWait wait = new WebDriverWait(getDriver(), 120);
			wait.until(ExpectedConditions.elementToBeClickable(byMensagem));
			System.out.println("Passou!");
		}catch(Exception e){
			System.out.println("Falhou!");
		}
	}

	public void selecionarClasse() {
		String classe = "Coach";

		if (classe == "Coach") {
			utils.clicar(page.classEconomy());
		}
		if (classe == "Business") {
			utils.clicar(page.classBusiness());
		}
		if (classe == "First") {
			utils.clicar(page.classFirst());
		}
	}

	public void selectPassengers() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 120);
		wait.until(ExpectedConditions.elementToBeClickable(page.cmpPassengers()));
		Select passengers = new Select(getDriver().findElement(page.cmpPassengers()));
		passengers.selectByValue("1");
	}

	public void clicarBotaoContinueFind() {
		utils.clicar(page.btnContinueFind());
	}

	public void selectAirLine() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 120);
		wait.until(ExpectedConditions.elementToBeClickable(page.cmpAirLine()));
		Select airLine = new Select(getDriver().findElement(page.cmpAirLine()));
		airLine.selectByVisibleText("Blue Skies Airlines");
	}

	public void selectFlight() {
		utils.clicar(page.outFlight());
	}

	public void btnContinuaReserve() {
		utils.clicar(page.btnContinueReserve());
	}

	public void preencherNomeCartao() {
		utils.escrever(page.cardFirstName(), "Guilherme");
		utils.escrever(page.cardLastName(), "Aguiar");
	}

	public void preencherNumeroCartao() {
		utils.escrever(page.cardNumber(), "0000000000000000");
	}

	public void preencherNomePassageiro() {
		utils.escrever(page.cmpFirstNamePassangers(), "Guilherme");
		utils.escrever(page.cmpLastNamePassangers(), "Aguiar");
	}

	public void clicarSecurePurchase() {
		utils.clicar(page.securePurchase());
	}

	public void validaCompra() {
		try {
			By byMensagem = page.flightConfirmation();
			WebDriverWait wait = new WebDriverWait(getDriver(), 120);
			wait.until(ExpectedConditions.elementToBeClickable(byMensagem));
			System.out.println("Passou!");
		}catch(Exception e){
			System.out.println("Falhou!");
		}
	}
}
