package week4assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
//Enter a user name and password.
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		
// Click the "Login" button.
		driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
		
// Click on the "CRM/SFA" link.
		driver.findElement(By.linkText("CRM/SFA")).click();
//create contact1
		driver.findElement(By.linkText("Create Contact")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Mirnalini");
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("A");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
//contact2
		driver.findElement(By.linkText("Create Contact")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Hemalatha");
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("M");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close();
}
}