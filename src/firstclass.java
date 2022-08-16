import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chrome diver\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
	driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("xyz@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder = 'Password']")).sendKeys("qwerty");
		driver.findElement(By.cssSelector("button[data-testid = 'royal_login_button']")).click();
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[2]/div/div/input")).sendKeys("jhiuhj");
		
		
		
		
		
		
		
		
		
	}

}
