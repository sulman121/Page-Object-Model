package BaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import UtilPackage.WebListener;
import bsh.BshClassManager.Listener;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static Properties prop;
	public static WebDriver driver;
    public  EventFiringWebDriver e_driver;
    public  WebListener listeners;
    
	public Base() throws IOException {
		prop = new Properties();
		FileInputStream fs = new FileInputStream("src/main/java/Config/Config.properties");
		prop.load(fs);

	}

	public  void initialzation() throws IOException {
		String browser = prop.getProperty("browser");

		if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}
		listeners = new WebListener();
		e_driver = new EventFiringWebDriver(driver);
		e_driver.register(listeners);
		driver = e_driver;
	
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		
		
		
		
		
	}

}
