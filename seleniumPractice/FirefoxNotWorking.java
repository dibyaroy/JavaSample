package seleniumPractice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxNotWorking {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		
		
	}

}
