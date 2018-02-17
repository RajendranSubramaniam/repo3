package myMavenProjectTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class myMavenProjectChromeLaunch {
	
	
  @Test
  public void chromeLaunch() {
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://www.google.co.uk");
	  
	  
	  	  
  }
}
