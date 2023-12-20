# Find Element by Text in Selenium WebDriver

## Find Element in Selenium
- To find the only or first matching web element in case of multiple elements from the web page for the given locator.
- Returns only a single matching web element.
- No indexing as only one web element is returned.
- For no matching element, throw NoSuchElementException.

```WebElement element = driver.findElement(By locator);```

## Find Elements in Selenium
- To find all the matching web elements from the webpage for the given locator.
- Returns the collection of all matching web elements as a list.
- All web elements are indexed as a list starting from 0.
- For no matching element, no exception is thrown. Instead returns an empty list of size 0.

```List<WebElement> elements = driver.findElements(By locator);```

## Different types of findElement implementations
### Find Element By Text In Selenium for a complete Text match
```WebElement checkbox= driver.findElement(By.xpath(“//a[text()=’Checkbox Demo’]”));```

### Find Element By Text In Selenium for partial Text match
```List<WebElement> tableOptions=driver.findElements(By.xpath(“//a[contains(text(),’Table’)”);```

### Find Element by Text in Selenium using text() and contains methods
```WebElement element= driver.findElement(By.xpath(“//a[contains(text(),’Dynamic’)”);```



## About Project
It is created using the latest Selenium 4 features with Java, TestNG and Maven for Web-based automation.

This is the list of tools, being used in this framework:
1. Apache Maven
2. Java 8
3. Selenium Cloud Grid - [LambdaTest](https://www.lambdatest.com) Platform
4. TestNG Framework

## Steps for Local Execution
1. Import this project in Eclipse/IntelliJ as an “Existing Maven Project”.
2. Go to test class file and Run a test case for your desired find element strategy.
3. You can see the logs coming up on Console as your execution progresses.
4. Since we are using RemoteWebDriver and executing on the Cloud Grid platform, LambdaTest, you can log in to the same and view detailed logs on the dashboard.
