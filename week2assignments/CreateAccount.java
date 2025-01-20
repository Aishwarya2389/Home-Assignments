package week2assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class CreateAccount {

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
WebElement Dropdown = driver.findElement(By.name("industryEnumId"));
Select option = new Select(Dropdown);
option.selectByIndex(3);
WebElement Dropdown1 = driver.findElement(By.name("ownershipEnumId"));
Select option1 = new Select(Dropdown1);
option1.selectByVisibleText("S-Corporation");
WebElement dropDown2 = driver.findElement(By.id("dataSourceId"));
Select option2=new Select(dropDown2);
option2.selectByValue("LEAD_EMPLOYEE");
WebElement dropDown3 = driver.findElement(By.id("marketingCampaignId"));
Select option3=new Select(dropDown3);
option3.selectByIndex(5);
WebElement dropDown4 = driver.findElement(By.id("generalStateProvinceGeoId"));
Select option4=new Select(dropDown4);
option4.selectByValue("TX");
driver.findElement(By.xpath("//input[contains(@class,'smallSubmit')]")).click();
Thread.sleep(4000);
driver.close();
	}

}
