package test;

import java.net.*;
import java.util.HashMap;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
	
	  public RemoteWebDriver driver = null;

      String username = System.getenv("LT_USERNAME") == null ? "<lambdatest_username>" : System.getenv("LT_USERNAME");
      String accessKey = System.getenv("LT_ACCESS_KEY") == null ? "<lambdatest_accesskey>" : System.getenv("LT_ACCESS");

      @BeforeTest
      public void setup() 
      {
    	  try 
    	  {
    		  ChromeOptions chromeOptions = new ChromeOptions();
    		  chromeOptions.setPlatformName("Windows 10");
    		  chromeOptions.setBrowserVersion("121.0");
                          
    		  HashMap<String, Object> ltOptions = new HashMap<String, Object>();
    		  ltOptions.put("build", "Find Element by Specific Text");
    		  ltOptions.put("project", "Find Element by Specific Text in Selenium");
    		  chromeOptions.setCapability("LT:Options", ltOptions);

    		  driver = new RemoteWebDriver(
    				  new URL("https://" + username + ":" + accessKey + "@hub.lambdatest.com/wd/hub"), chromeOptions);
    	  }
    	  catch (MalformedURLException e) 
    	  {
    		  e.printStackTrace();
    	  }
      }


      @AfterTest
      public void tearDown() 
      {
    	  driver.quit();
      }
}
