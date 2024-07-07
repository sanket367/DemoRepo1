package automation_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.testingbaba.com/old/index.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[1]/button")).click(); 
	}

}
