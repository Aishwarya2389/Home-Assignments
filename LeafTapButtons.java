package week3assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTapButtons {

	public static void main(String[] args) throws InterruptedException {
//Precondition:
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
//Click on the button with the text Click 
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
//Get the Title  and confirmation check
		String Title = driver.getTitle();
		System.out.println(Title);
//Navigate to home page
		driver.navigate().back();
		
//Check if the button with the text Confirm if the button is disabled.
		WebElement enable =driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']"));
		boolean flag = enable.isEnabled();
		System.out.println("Button is enabled-"+flag);
		Thread.sleep(1000);
//Find and print the position of the button with the text 'Submit'.
		WebElement submit = driver.findElement(By.id("j_idt88:j_idt94"));
		Point point = submit.getLocation();
		System.out.println("Submit button is positioned in - " +point);
		int x = point.getX();
		System.out.println("x="+x);	
		
//Find and print the background color of the button. 
		WebElement color =driver.findElement(By.id("j_idt88:j_idt94"));
		String colour = color.getCssValue("background-color");
		System.out.println("Background color is-"+colour);
	
//Find and print the height and width .
		WebElement submit1 = driver.findElement(By.id("j_idt88:j_idt98"));
		Dimension size = submit1.getSize();
		System.out.println("Height and Widht of the button is " +size);
	Thread.sleep(2000);
//Close the browser window.
	driver.close();
	}

}
