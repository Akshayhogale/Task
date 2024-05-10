package AutomationTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class UITesting2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		Dimension targetSize = new Dimension(1920,1080);
		driver.manage().window().setSize(targetSize);
		driver.get("https://www.getcalley.com/page-sitemap.xml");
		driver.findElement(By.linkText("https://www.getcalley.com/calley-call-from-browser/")).click();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/calley-call-from-browser.png");
        Files.copy(scr, dest);
		
        Thread.sleep(2000);
		WebDriver driver1 = new FirefoxDriver();
		Thread.sleep(1000);
		driver1.manage().window().maximize();
		Thread.sleep(1000);
		Dimension targetSize1 = new Dimension(1366,768);
		driver1.manage().window().setSize(targetSize1);
		driver1.get("https://www.getcalley.com/page-sitemap.xml");
		driver1.findElement(By.linkText("https://www.getcalley.com/calley-call-from-browser/")).click();
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File scr1 = ts1.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./screenshots/calley-call-from-browser1.png");
        Files.copy(scr1, dest1);
		
        Thread.sleep(2000);
		WebDriver driver2 = new EdgeDriver();
		Thread.sleep(1000);
		driver2.manage().window().maximize();
		Thread.sleep(1000);
		Dimension targetSize2 = new Dimension(1536,864);
		driver2.manage().window().setSize(targetSize2);
		driver2.get("https://www.getcalley.com/page-sitemap.xml");
		driver2.findElement(By.linkText("https://www.getcalley.com/calley-call-from-browser/")).click();
		TakesScreenshot ts2= (TakesScreenshot) driver;
		File scr2 = ts2.getScreenshotAs(OutputType.FILE);
		File dest2 = new File("./screenshots/calley-call-from-browser2.png");
        Files.copy(scr2, dest2);
	}
}
