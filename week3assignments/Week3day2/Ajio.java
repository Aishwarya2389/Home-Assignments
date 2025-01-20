package week3assignments;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
//Launch the URL 
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//In the search box, type as "bags" and press enter
		driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("bags");
		
//To the left of the screen under "Gender" click on "Men"
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("(//label[contains(@class,'facet-linkname facet')])[2]")).click();
		Thread.sleep(1000);
//Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("(//label[contains(@class,'facet-linkname facet')])[8]")).click();
		Thread.sleep(1000);
//Print the count of the items found.
		WebElement Items = driver.findElement(By.xpath("//div[@class='length']"));
		String Total = Items.getText();
		System.out.println("No.of.items----"+Total);
		Thread.sleep(1000);
//Get the list of brand of the products displayed in the page and print the list.
		List<WebElement> Brandlist =driver.findElements(By.xpath("(//span[@class='facet-left-pane-label'])[4]"));
		int BL = Brandlist.size();
		System.out.println("Total No.Of.Brands:"+BL);
		for(int i = 0;i<Brandlist.size();i++)
		{
	
			System.out.println(Brandlist.get(i).getText());
		}
		Thread.sleep(1000);
//Get the list of names of the bags and print it
				List<WebElement> bagname=driver.findElements(By.className("nameCls"));
				int BN=bagname.size();
				System.out.println("BagNames are:"+BN);
				for(int i = 0;i<bagname.size();i++)
				{
			
					System.out.println(bagname.get(i).getText());
				}
				driver.close();
	}

}
