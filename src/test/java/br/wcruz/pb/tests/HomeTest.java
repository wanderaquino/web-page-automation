package br.wcruz.pb.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import br.wcruz.pb.page.ChallengeHomePage;

import static br.wcruz.pb.core.FactoryDriver.getDriver;
import static br.wcruz.pb.core.FactoryDriver.releaseDriver;

import java.util.List;

public class HomeTest {

			public static final String HOME_URL = "https://the-internet.herokuapp.com/challenging_dom";
			private ChallengeHomePage homePage;
			
			@Before
			public void setupTest() {
				System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
				getDriver().get(HOME_URL);

				homePage = new ChallengeHomePage(getDriver());
			}

			@Test
			public void shouldClickButtonElement() {
				setupTest();
				homePage.clickButtonElement(homePage.getbuttonElement());
				finishTest();
			}

			@Test
			public void shouldClickAlertButtonElement() {
				setupTest();
				homePage.clickButtonElement(homePage.getbuttonAlertElement());
				finishTest();
			}

			@Test
			public void shouldClickSuccessButtonElement() {
				setupTest();
				homePage.clickButtonElement(homePage.getbuttonSuccessElement());
				finishTest();
			}

			@Test
			public void shoudClickOnAllEditButtons() {
				setupTest();
				List<WebElement> tableRows = homePage.getRowsOfTableBody();
				homePage.clickEditTableButton(tableRows, 7, "edit");
				finishTest();
			}

			@Test
			public void shoudClickOnAllDeleteButtons() {
				setupTest();
				List<WebElement> tableRows = homePage.getRowsOfTableBody();
				homePage.clickEditTableButton(tableRows, 7, "delete");
				finishTest();
			}

			@After
			public void finishTest() {
				releaseDriver();
			}
		}