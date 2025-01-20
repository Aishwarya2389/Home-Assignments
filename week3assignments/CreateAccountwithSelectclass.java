package week3assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class CreateAccountwithSelectclass {
	public static void main(String[] args)throws InterruptedException{
//precondition
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().window().maximize();
//user name and pwd
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
	driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
	driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
//Click on the "CRM/SFA" link.
	driver.findElement(By.linkText("CRM/SFA")).click();
//Click on the "Accounts" tab.
	driver.findElement(By.linkText("Accounts")).click();
	
//Click on the "Create Account" button.
	driver.findElement(By.linkText("Create Account")).click();
//Enter an account name
	driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("vijaya");
//Enter a description as "Selenium Automation Tester."
	driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
//Select "ComputerSoftware" as the industry.
	WebElement Dropdown = driver.findElement(By.name("industryEnumId"));
	Select option = new Select(Dropdown);
	option.selectByIndex(3);
//Select "S-Corporation" as ownership using SelectByVisibleText.
	WebElement Dropdown1 = driver.findElement(By.name("ownershipEnumId"));
	Select option1 = new Select(Dropdown1);
	option1.selectByVisibleText("S-Corporation");
//Select "Employee" as the source using SelectByValue.
	WebElement dropDown2 = driver.findElement(By.id("dataSourceId"));
	Select option2=new Select(dropDown2);
	option2.selectByValue("LEAD_EMPLOYEE");
//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
	WebElement dropDown3 = driver.findElement(By.id("marketingCampaignId"));
	Select option3=new Select(dropDown3);
	option3.selectByIndex(6);
//Select "Texas" as the state/province using SelectByValue.
	WebElement dropDown4 = driver.findElement(By.id("generalStateProvinceGeoId"));
	Select option4=new Select(dropDown4);
	option4.selectByValue("TX");
//Click the "Create Account" button
	driver.findElement(By.xpath("//input[contains(@class,'smallSubmit')]")).click();
	Thread.sleep(4000);
//Verify that the account name is displayed correctly.
	WebElement AccName = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]"));
	String Name = AccName.getText();
	Boolean Account = Name.contains(Name);
	System.out.println("Correct Account Name is presented:"+Account+ "--" + "--" +   Name);
//Close the browser
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
}
}