package br.wcruz.pb.dsl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ParanaBancoDSL {
	
	private WebDriver driver;
	
	public ParanaBancoDSL (WebDriver driver) {
		this.driver = driver;
	}
	
	/*Buttons and interactions Management */
	public WebElement getButtonElementByXpath(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}
	public void clickButtonElement(WebElement element) {
		element.click();
	}
	
	/*Table Management */
	public WebElement getTablePartByXpath(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}
			
	public List<WebElement> getListOfTableRows (WebElement body) {
		return body.findElements(By.xpath("./tr"));
	}
	
	public WebElement getButtonByXpath(WebElement row, String buttonXpath) {
		return row.findElement(By.xpath(buttonXpath));
	}
	
	public WebElement getButtonByXpath(String buttonXpath) {
		return driver.findElement(By.xpath(buttonXpath));
	}
	
	public WebElement getButtonByColumnId(WebElement row, int columnId) {
		return row.findElement(By.xpath("./td["+columnId+"]"));
	}
		
	public void clickRowTableButtonsByXpath(List<WebElement> rows, int columnId, String textButton) {
		for(int i = 0; i < rows.size(); i++) {
			getButtonByXpath(rows.get(i), "./td["+columnId+"]/a[text()="+"\""+textButton+"\""+"]").click();
		}
	}
}