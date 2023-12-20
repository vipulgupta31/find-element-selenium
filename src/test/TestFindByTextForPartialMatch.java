package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestFindByTextForPartialMatch extends BaseTest {

	@Test
	public void testFindElementByPartialTextMatch() {

		System.out.println("Logging into Lambda Test Selenium Playground");
		driver.get("https://www.lambdatest.com/selenium-playground/");
		List<WebElement> tableOptions = driver.findElements(By.xpath("//a[contains(text(),'Table')]"));
		for (WebElement e : tableOptions) {
			System.out.println("The different options with table in name are:" + e.getText());
		}
	}
}
