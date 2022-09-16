package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestRemote {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {


	//	ChromeOptions opt = new ChromeOptions();
		FirefoxOptions opt = new FirefoxOptions();
		
	//	EdgeOptions opt = new EdgeOptions();
		
		WebDriver driver = new RemoteWebDriver(new URL("http://13.232.58.223:4444"),opt);
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("Hello Grid !!!");
		Thread.sleep(5000);
		driver.quit();
		

	}

}
