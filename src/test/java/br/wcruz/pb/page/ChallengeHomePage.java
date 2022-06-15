package br.wcruz.pb.page;

import static br.wcruz.pb.core.FactoryDriver.getDriver;

import java.util.List;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.wcruz.pb.dsl.ParanaBancoDSL;

public class ChallengeHomePage {
	private ParanaBancoDSL dsl;
	
	public ChallengeHomePage(WebDriver driver) {
		dsl = new ParanaBancoDSL(driver);
	};
	
	@Before
	public void setupTest() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
//		getDriver().get(HOME_URL);
		
		dsl = new ParanaBancoDSL(getDriver());
	}
	
	public WebElement getbuttonElement() {
		return dsl.getButtonElementByXpath("//*[@id=\"content\"]//div[@class=\"row\"]/div/div/a[@class=\"button\"]");
	}

	public WebElement getbuttonAlertElement() {
		 return dsl.getButtonElementByXpath("//*[@id=\"content\"]//div[@class=\"row\"]/div/div/a[@class=\"button alert\"]");
	}
	
	public WebElement getbuttonSuccessElement() {
		return  dsl.getButtonElementByXpath("//*[@id=\"content\"]//div[@class=\"row\"]/div/div/a[@class=\"button success\"]");
	}
			
	public void clickButtonElement(WebElement buttonElement) {
		dsl.clickButtonElement(buttonElement);
	}
	
	public WebElement getTableBody() {
		return dsl.getTablePartByXpath("//div[@id=\"content\"]//table/tbody");
	}
	
	public List<WebElement> getRowsOfTableBody() {
		return dsl.getListOfTableRows(getTableBody());
	}
	
	public void clickEditTableButton (List<WebElement> tableRows, int columnId, String buttonName) {
		dsl.clickRowTableButtonsByXpath(tableRows, columnId, buttonName);
	}
}