package week2assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class CreateLead {

	
	public static void main(String[] args)throws InterruptedException {
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
		
		// Click on the "Leads" tab.
		driver.findElement(By.linkText("Leads")).click();
		
		//Click on the "Create Lead" button
		driver.findElement(By.linkText("Create Lead")).click();
		
		/*Enter the first name*/
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Prajeeth");
		
		//Enter the last name
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("kumar");
		
		//Enter the Company name
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Maayanmedia");
	
		//Enter a Title 
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalProfTitle']")).sendKeys("Business");
		
		//Click the "Create Lead" button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(5000);
		
		//Close the Browser
		driver.close();
	}

}
