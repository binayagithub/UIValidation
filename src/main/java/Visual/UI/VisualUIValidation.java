package Visual.UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.applitools.eyes.selenium.Eyes;

public class VisualUIValidation
{
	public static WebDriver driver;
	public static Eyes eyes;
	
	public static void main(String[] args)
	{
		
		try
		{
			String chromeDriverLaunch ="D:/chromedriver.exe";
			
			System.setProperty("webdriver.chrome.driver", chromeDriverLaunch);
			ChromeOptions o = new ChromeOptions();
			o.addArguments("disable-extensions");
			o.addArguments("--start-maximized");
			
			driver = new ChromeDriver(o);
			
			eyes = new Eyes();
			
			eyes.setApiKey("kpNPv4d85D7tePADMLAY5Qw3nJFafGzeNDduPd4AgTo110");
					
			driver.navigate().to("https://applitools.com/images/tutorials/applitools_hero.png");
			
			eyes.open(driver, "ABC App", "Validate UI changes as per requirements");
			
			 
			 eyes.checkWindow();
			 
			 eyes.close();
			 
			 driver.close();
		}finally
		{
			eyes.abortIfNotClosed();
		}
	}
}
