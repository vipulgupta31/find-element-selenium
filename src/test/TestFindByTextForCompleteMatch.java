package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestFindByTextForCompleteMatch extends BaseTest{

	@Test
	public void testFindElementByCompleteTextMatch()
	{
		System.out.println("Logging into Lambda Test Selenium Playground");
        driver.get("https://www.lambdatest.com/selenium-playground/");
        WebElement checkBoxDemoPage= driver.findElement(By.xpath("//a[text()='Checkbox Demo']"));
        checkBoxDemoPage.click();
        System.out.println("Clicked on the Checkbox Demo Page");
        WebElement header=driver.findElement(By.xpath("//h1"));
        System.out.println("The header of the page is:"+header.getText());
	}
}
