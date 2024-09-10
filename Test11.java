import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test11 {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new FirefoxDriver();
        driver.get(" https://www.getcalley.com/page-sitemap.xml");
        driver.findElement(By.linkText("https://www.getcalley.com/")).click();
        driver.manage().window().maximize();
        driver.manage().window().setSize(new Dimension(414,896));
        File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot,new File("C:\\Users\\susmi\\eclipse-workspace\\DemoProject\\Mobile/screenshot2.png"));
        driver.quit();
	}
}
