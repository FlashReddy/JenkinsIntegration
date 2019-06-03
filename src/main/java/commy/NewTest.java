package commy;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
	public static WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
	 
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
	   driver=new ChromeDriver();
	  driver.get("https:\\www.google.com");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
