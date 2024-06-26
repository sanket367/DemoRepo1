package script;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingBaba_Script {
  
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver .get("https://www.testingbaba.com/old/index.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[1]/button")).click();
		driver.findElement(By.xpath("//*[text()='Practice']")).click();
		driver.findElement(By.xpath("//*[@data-target=\"#elements\"]")).click();
		driver.findElement(By.xpath("//*[text()='text box']")).click();
		driver.findElement(By.xpath("//*[@id=\"fullname1\"]")).sendKeys("ajay");
		driver.findElement(By.xpath("//*[@id=\"fullemail1\"]")).sendKeys("ajay@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"fulladdresh1\"]")).sendKeys("Noida, sector-63");
		driver.findElement(By.xpath("//*[@id=\"paddresh1\"]")).sendKeys("New Delhi, Ashok Nagar");
		driver.findElement(By.xpath("//*[@id=\"tab_1\"]/div/div[1]/form/input[3]")).click();
		List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"tab_1\"]/div/div[2]/label"));
		for(WebElement element: list)
		{
			String value =element.getText();
			System.out.println(value);
		}
	}
}
