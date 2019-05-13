package GitControler;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class createCookie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Rupesh\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().maximize();
		
		Cookie testCookie1 = new Cookie("Username", "TestUser");
		driver.manage().addCookie(testCookie1);
		

		Cookie testCookie2 = new Cookie("Paasword", "TestPassword");
		driver.manage().addCookie(testCookie2);
		
		
		
		Set<Cookie> ck = driver.manage().getCookies();
		
		for(Cookie c:ck)
		{
			System.out.println("Name" + c.getName());
			System.out.println("Value" + c.getValue());
			System.out.println("Domain" + c.getDomain());
			System.out.println("Path" + c.getPath());
			System.out.println("Expires" + c.getExpiry());
			
			System.out.println(" ");
		
		}
		
		
		
		
	}

}
