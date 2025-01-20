package week3assignments;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
public class FBwithSelect {

	public static void main(String[] args)throws InterruptedException {
//Precondition:
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//Click on the Create new account button.
		driver.findElement(By.linkText("Create new account")).click();
//Enter the First name.
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Riya");
//Enter the Surname.
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("V");
//Enter the Mobile number or email address.
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("9994347883");
//Enter the New password.
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Aishu152");
//Handle all three dropdowns in Date of birth
		WebElement date = driver.findElement(By.id("day"));
		Select opt1=new Select(date);
		opt1.selectByValue("23");
		WebElement Mon = driver.findElement(By.id("month"));
		Select opt2=new Select(Mon);
		opt2.selectByVisibleText("Jul");
		WebElement Yr = driver.findElement(By.id("year"));
		Select opt3=new Select(Yr);
		opt3.selectByValue("1989");
//Select the radio button in Gender.
		driver.findElement(By.xpath("//input[@id='sex']")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
