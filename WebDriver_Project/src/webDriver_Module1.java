import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class webDriver_Module1 {
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver" , "E:\\geckodriver.exe");
		
		WebDriver F_Browser = new  FirefoxDriver();
		F_Browser.get("http://perfmen.in");
		String s = F_Browser.getPageSource();
		
		System.out.println(" hey mahesh....");
		System.out.println(s);
		
	}

}
