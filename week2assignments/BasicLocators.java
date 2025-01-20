package week2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {

	
		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
			driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
			driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Accounts")).click();
			driver.findElement(By.linkText("Create Account")).click();
			driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Aishwarya");
			driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
			driver.findElement(By.xpath("//input[@id='numberEmployees'] ")).sendKeys("30");
			driver.findElement(By.xpath("//input[@id='officeSiteName'] ")).sendKeys("LeafTaps");
			driver.findElement(By.xpath("//span[@class='x-panel-header-text']")).click();
			Thread.sleep(3000);
		
			driver.close();
		}
}

