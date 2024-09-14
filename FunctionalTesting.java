import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FunctionalTesting {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.dealsdray.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.findElement(By.id("mui-1")).sendKeys("prexo.mis@dealsdray.com");
        driver.findElement(By.id("mui-2")).sendKeys("prexo.mis@dealsdray.com");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//div[@class='MuiBox-root css-d0uhtl']/descendant::p[text()='Orders']")).click();
        driver.findElement(By.xpath("//div[@class='MuiBox-root css-0']/descendant::button")).click();
        driver.findElement(By.id("mui-7")).sendKeys("C:\\Users\\susmi\\eclipse-workspace\\DemoProject\\FunctionalTesting\\demo-data.xlsx");
        driver.findElement(By.xpath("//div[@class='MuiFormControl-root MuiTextField-root css-i44wyl']/following::button")).click();
        File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot,new File("C:\\Users\\susmi\\eclipse-workspace\\DemoProject\\screenshots/outputscreenshot.png"));
        driver.quit();

	}

}
