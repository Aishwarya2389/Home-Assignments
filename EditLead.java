package week3assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
public class EditLead {

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
		
		// Click on the "Leads" tab.
		driver.findElement(By.linkText("Leads")).click();
		
		//Click on the "Create Lead" button
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter the Company name
				driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
		/*Enter the first name*/
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Prajeeth");
				
		//Enter the last name
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Aishu");
	
		//Enter the FirstName (Local) Field Using X path. 
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("charles");
		
		//Enter the Department Field Using any Locator of Your Choice.
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("IT");
		
		//Enter the Description Field Using any Locator of your choice.  
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("It's a broad field that includes many subfields and specializations");
		Thread.sleep(2000);
		//Enter your email in the E-mail address Field using the locator of your choice.
		driver.findElement(By.xpath("//input[contains(@id,'primaryEmail')]")).sendKeys("xyz@gmail.com");
		
		//Select State/Province as NewYork Using Visible Text.
		WebElement dropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		 Select state  = new Select(dropdown);
		 state.selectByVisibleText("New York");
	
		 //Click on the Create Button.
		 driver.findElement(By.xpath("//input[@type='submit']")).click(); 
		Thread.sleep(3000);
		
		//Click on the edit button
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(2000);
		
		//Clear the Description Field.
		driver.findElement(By.xpath("//textarea[@class='inputBox']")).clear();
		Thread.sleep(2000);
		
		//Fill the Important Note Field with Any text.
		 driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("verifying that what was specified is what was delivered: ");
		 Thread.sleep(2000);
		 // Click on the update button. 
		 driver.findElement(By.xpath("//input[@type='submit']")).click(); 
		 
		// Get the Title of the Resulting Page. 
		 String title = driver.getTitle();
			System.out.println(title);
			Thread.sleep(3000);
			
		//Close the browser window.
			driver.close();
		
		
}


}
