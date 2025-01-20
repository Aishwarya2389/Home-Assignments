package week3assignments;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.http.RetryRequest;
public class DeleteLead {

	public static void main(String[] args) throws InterruptedException{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter a user name and password.
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
				driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		
		// Click the "Login" button.
				driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
				
		// Click on the "CRM/SFA" link.
				driver.findElement(By.linkText("CRM/SFA")).click();
				
		// Click on the "Leads" tab.
				driver.findElement(By.linkText("Leads")).click();
				
		//Click "Find leads."
				driver.findElement(By.linkText("Find Leads")).click();
				
		//Click on the "Phone" tab.
				driver.findElement(By.linkText("Phone")).click();
				
		//Enter the phone number.
				driver.findElement(By.name("phoneNumber")).sendKeys("99");
				
		//Click the "Find leads" button.
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
				
		//Capture the lead ID of the first resulting lead.
				driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']"));
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
				WebElement Name = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]"));
				String value = Name.getText();
				System.out.println("Value: " + value);
				//Click the "Delete" button.
				Thread.sleep(1000);
				driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		//Click "Find leads" again and Enter the captured lead ID.
				driver.findElement(By.linkText("Find Leads")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@name='id']")).sendKeys(value);
		//Stored Lead Id not Display
				driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
				Thread.sleep(5000);
		//Close the Browser
				driver.close();
	}
	
	

}
