package AutomationTest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class FunctionalTesting {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.dealsdray.com/");
		
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.xpath("//div[@class=\"MuiBox-root css-79elbk\"]")).click();
		
		driver.findElement(By.xpath("//span[@class=\"sidenavHoverShow css-1s178v5\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='Orders']")).click();
		
     	driver.findElement(By.xpath("//div[@class=\"MuiBox-root css-0\"][2]")).click();
     	Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@aria-invalid=\"false\"]")).sendKeys("D:\\SELENIUMDATA\\Test\\data\\demo-data.xlsx");
		driver.findElement(By.xpath("//button[.='Import']")).click();
		
		Thread.sleep(500);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/BulkOrder.png");
        Files.copy(scr, dest);
	}

}
