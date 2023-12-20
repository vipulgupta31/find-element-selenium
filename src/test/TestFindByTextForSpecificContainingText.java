package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestFindByTextForSpecificContainingText extends BaseTest {
	@Test
	public void testFindElementBySpecificTextMatch() {
		System.out.println("Logging into Lambda Test Selenium Playground");
		driver.get("https://www.lambdatest.com/selenium-playground/");
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Dynamic')]"));
		element.click();
		System.out.println("Clicked on the Dynamic Data Loading link");
		WebElement header = driver.findElement(By.xpath("//h1"));
		System.out.println("The header of the page is:" + header.getText());
	}

}
