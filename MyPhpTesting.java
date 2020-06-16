

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;




public class MyPhpTesting{
  @Test
  public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
	 // System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
    
    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.addArguments(new String[] { "--headless" });
    chromeOptions.addArguments(new String[] { "--no-sandbox" });
    ChromeDriver chromeDriver = new ChromeDriver(chromeOptions);
    
    chromeOptions.addArguments(new String[] { "--headless" });
    chromeDriver.get("http://ec2-3-23-17-76.us-east-2.compute.amazonaws.com:9999/");
    chromeDriver.manage().timeouts().implicitlyWait(3L, TimeUnit.SECONDS);
    chromeDriver.findElement(By.id("About Us")).click();
    String test = chromeDriver.findElement(By.id("PID-ab2-pg")).getText();
    System.out.println(test);
    Assert.assertEquals(test, "This is about page. Lorem Ipsum Dipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
    System.out.println("Test Succeeded!!");
    chromeDriver.quit();
  }
}
