import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\config\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 20); 
        		//WebDriverWait(driver, 20);
        driver.get("https://thrive-frontend.azurewebsites.net/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-signup-btn']")));
        driver.findElement(By.xpath("//button[@class='btn btn-signup-btn']")).click();
        driver.findElement(By.xpath("//div[text()='Skip']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"heading sign-up-title\"]")));
        driver.quit();
    }
}
