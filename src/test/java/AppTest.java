//package PatonaQA.DemoMavenEclipseProject;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void verifySignUp()
    {
    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\config\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 20); 
        		//WebDriverWait(driver, 20);
        driver.get("https://thrive-frontend.azurewebsites.net/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-signup-btn']")));
        String title = driver.getTitle();
        Assert.assertEquals(title, "Thrive");
        driver.findElement(By.xpath("//button[@class='btn btn-signup-btn']")).click();
        driver.findElement(By.xpath("//div[text()='Skip']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"heading sign-up-title\"]")));
        driver.quit();
    	//assertTrue( true );
        
    }
    
    @Test
    public void verifyLogin()
    {
    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\config\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 20); 
        		//WebDriverWait(driver, 20);
        driver.get("https://thrive-frontend.azurewebsites.net/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-signup-btn']")));
        String title = driver.getTitle();
        Assert.assertEquals(title, "Thrive");
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='signInName']")));
        driver.findElement(By.xpath("//input[@id='signInName']")).sendKeys("nitin.hambir@patona.com.au");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password1!");
        driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
        
        //driver.quit();
    	//assertTrue( true );
        
    }
}
