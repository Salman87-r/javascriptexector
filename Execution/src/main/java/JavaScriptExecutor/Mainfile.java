package JavaScriptExecutor;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mainfile {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.twoplugs.com/");
		WebElement join=driver.findElement(By.xpath("//header/div[1]/ul[1]/li[2]/a[1]"));
		WebElement Login=driver.findElement(By.xpath("//header/div[1]/ul[1]/li[1]/a[1]"));
		Utilities.flash(join, driver);
		Utilities.drawborder(join, driver);
//		File tempFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(tempFile, new File("Secreen/Two.png"));
//		String tile=Utilities.gettile(driver);
//		System.out.println(tile);
////		Utilities.click(Login, driver);
////		Utilities.alert(driver, "Click Login Button");
////		Utilities.refresh(driver);
		WebElement PIC=driver.findElement(By.xpath("//body/div[1]/section[4]/div[2]/ul[1]/li[1]/div[1]/img[1]"));
//		Utilities.scrollage(driver, PIC);
		Utilities.scrollpageend(driver);
//		//driver.close();
	}	

}
