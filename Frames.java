package week4assignments;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Frames {

	public static void main(String[] args) throws InterruptedException {
		//Pre-condition
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		WebDriver frame = driver.switchTo().frame(1);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click the "Try It" button inside the frame
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		
		//switch to alert
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		
		//Click OK/Cancel in the alert that appears
		alert.sendKeys("Aishu");
		Thread.sleep(2000);
		alert.accept();


}
}