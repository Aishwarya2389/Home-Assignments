package week2assignments;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class FacebookAccount {

	public static void main(String[] args)throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Riya");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("V");
		WebElement date = driver.findElement(By.id("day"));
		Select opt1=new Select(date);
		opt1.selectByValue("23");
		WebElement Mon = driver.findElement(By.id("month"));
		Select opt2=new Select(Mon);
		opt2.selectByVisibleText("Jul");
		WebElement Yr = driver.findElement(By.id("year"));
		Select opt3=new Select(Yr);
		opt3.selectByValue("1989");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='sex']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("9994347883");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Aishu152");
		
Thread.sleep(5000);

}
}