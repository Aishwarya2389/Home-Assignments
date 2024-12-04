package week4assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		//Pre-condition
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
			
		//Click on the Contacts button.
			driver.findElement(By.linkText("Contacts")).click();
		//Click on Merge Contacts.
			driver.findElement(By.linkText("Merge Contacts")).click();
		//Click on the widget of the "From Contact".
			driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		//getWindowHandles
				Set<String> allWindow = driver.getWindowHandles();
		//convert set into list
				List<String> getWindow=new ArrayList<String>(allWindow);
				driver.switchTo().window(getWindow.get(1));
				String childTitle = driver.getTitle();
				driver.switchTo().window(getWindow.get(1));
		//Click on the first resulting contact
			 driver.findElement(By.xpath("//a[@class='linktext']")).click();
			 driver.switchTo().window(getWindow.get(0));
			 //Thread.sleep(5000);
		//Click on the widget of the "To Contact".
			 driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
			
		//getWindowHandles
				Set<String> allWin = driver.getWindowHandles();
		//convert set into list
				List<String> getWindow1=new ArrayList<String>(allWin);
				driver.switchTo().window(getWindow1.get(1));
				String childTitle1 = driver.getTitle();
				driver.switchTo().window(getWindow1.get(1));
	//Click on the first resulting contact
			 driver.findElement(By.xpath("(//a[@class='linktext'])[5]")).click();
			 driver.switchTo().window(getWindow1.get(0));
			 //Thread.sleep(5000);
		//Click on the Merge button.
			 driver.findElement(By.linkText("Merge")).click();
		//switch to alert
				Alert alert = driver.switchTo().alert();
				//Thread.sleep(2000);
		//Accept the alert.
				alert.accept();
		//Verify the title of the page.
				String contactName = driver.findElement(By.xpath("//span[@id='viewContact_fullName_sp']")).getText();
				System.out.println(contactName);
				String title = driver.getTitle();
				String expTitle = "View Contact | opentaps CRM";

				if (title.equals(expTitle)) {
				System.out.println("Title matched");
				} 
				else {
				System.out.println("Title not matched");
				}

}
}