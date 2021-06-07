//package PatonaQA.DemoMavenEclipseProject;

//import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    
    
	
	@Test(enabled=false)
    public void verifySignUp()
    {
    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\config\\chromedriver.exe");
    	ChromeOptions options = new ChromeOptions();
    	//options.setExperimentalOption("debuggerAddress", "127.0.0.1:9222");
    	options.addArguments("start-maximized");
        options.setExperimentalOption("useAutomationExtension", false);
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
    	
    	WebDriver driver = new ChromeDriver(options);
        //WebDriver driver=new ChromeDriver();
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 20); 
//        		//WebDriverWait(driver, 20);
//        driver.get("https://thrive-frontend.azurewebsites.net/");
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-signup-btn']")));
//        String title = driver.getTitle();
//        Assert.assertEquals(title, "Thrive");
//        driver.findElement(By.xpath("//button[@class='btn btn-signup-btn']")).click();
//        driver.findElement(By.xpath("//div[text()='Skip']")).click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"heading sign-up-title\"]")));
        
        //filling signup form
//        driver.findElement(By.xpath("//span[contains(text(),'First Name')]/preceding-sibling::input")).sendKeys("Nitin");
//        driver.findElement(By.xpath("//span[contains(text(),'Last Name')]/preceding-sibling::input")).sendKeys("Hambir");
//        driver.findElement(By.xpath("//span[contains(text(),'Email')]/preceding-sibling::input")).sendKeys("hambir.nitin9@gmail.com");
//        driver.findElement(By.xpath("//div[@class='tnc-checkbox']")).click();
//        driver.findElement(By.xpath("//button[text()='SIGN UP']")).click();
        
        //Check email
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='open your email app']")));
        String windowHandle = driver.getWindowHandle();
//        String title = driver.getTitle();
//        JavascriptExecutor jse = (JavascriptExecutor)driver;
//        jse.executeScript("window.open()");
//      //Switch to new tab 
//        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
//        driver.switchTo().window(tabs.get(1));
        driver.get("https://accounts.google.com/signin");
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='identifierId']"))).sendKeys("hambir.nitin9@gmail.com");
        driver.findElement(By.id("identifierNext")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password']"))).sendKeys("Assg3814#91");
        driver.findElement(By.id("passwordNext")).click();
        System.out.println(driver.getTitle());
        
        
        //driver.quit();
    	//assertTrue( true );
        
    }
    
    
    @Test(enabled=false)
    public void verifyKYCKYBForSoleTrader() throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\config\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 60); 
        		//WebDriverWait(driver, 20);
        driver.get("https://thrive-frontend.azurewebsites.net/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-signup-btn']")));
        String title = driver.getTitle();
        Assert.assertEquals(title, "Thrive");
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='signInName']")));
        driver.findElement(By.xpath("//input[@id='signInName']")).sendKeys("amit.velhal@patona.com.au");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Amit@1111");
        WebElement loginButton = driver.findElement(By.xpath("//button[@id='continue' and text()='Login']"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].scrollIntoView(true);", loginButton);
        loginButton.click();
        //Thread.sleep(3000);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='heading normal-font']")));
//        WebElement startVerification =  driver.findElement(By.xpath("//button[text()='Start Verification']"));
//        jse.executeScript("arguments[0].scrollIntoView(true);", startVerification);
//        startVerification.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Middle Name')]/preceding-sibling::input")));
        driver.findElement(By.xpath("//span[contains(text(),'Middle Name')]/preceding-sibling::input")).sendKeys("ok");
        driver.findElement(By.xpath("//span[contains(text(),'Date Of Birth')]/preceding-sibling::input")).sendKeys("01012000");
        driver.findElement(By.xpath("//span[contains(text(),'Home Address')]/preceding-sibling::input")).sendKeys("123B-123C King Road, FAIRFIELD WEST NSW 2165");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='address-autocomplete__suggestions' and @aria-hidden='false']/li[1]")));
        driver.findElement(By.xpath("//ul[@class='address-autocomplete__suggestions' and @aria-hidden='false']/li[1]")).click();
        driver.findElement(By.xpath("//button[text()='save & continue']")).click();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Your ID Verification']")));
        driver.findElement(By.xpath("//div[text()='Driver Licence']/parent::div/following-sibling::img")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Driver Licence Number')]/preceding-sibling::input")).sendKeys("11111111");
        driver.findElement(By.xpath("//div[contains(text(),'State of Issue')]")).click();
        Thread.sleep(3000);
        boolean b= driver.findElement(By.xpath("//div[starts-with(@class,'select__menu')]/div[starts-with(@class,'select__menu-list')]/div[starts-with(@id,'react-select')]")).isDisplayed();
        String state = driver.findElement(By.xpath("(//div[starts-with(@class,'select__menu')]/div[starts-with(@class,'select__menu-list')]/div[starts-with(@id,'react-select')])[1]")).getText();
        System.out.println(state);
        driver.findElement(By.xpath("//div[starts-with(@class,'select__menu')]/div[starts-with(@class,'select__menu-list')]/div[starts-with(@id,'react-select')and text()='ACT']")).click();
        driver.findElement(By.xpath("//div[@class='verification-message']/img")).click();
        driver.findElement(By.xpath("//button[text()='Continue']")).click();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='search']")));
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("60591253115");
        driver.findElement(By.xpath("//div[@class='heading check-email']")).click();
        driver.findElement(By.xpath("//button[text()='search']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'60591253115')]/parent::span/following-sibling::div[@class='business-check-button']")));
        driver.findElement(By.xpath("//span[contains(text(),'60591253115')]/parent::span/following-sibling::div[@class='business-check-button']")).click();
        driver.findElement(By.xpath("//button[text()='Continue']")).click();
        
        boolean gstRegistered = driver.findElement(By.xpath("//div[contains(text(),'GST Registered')]/following-sibling::div[text()='Yes']")).isSelected();
        if(gstRegistered==false)
        {
        	driver.findElement(By.xpath("//div[contains(text(),'GST Registered')]/following-sibling::div[text()='Yes']")).click();
        }
        driver.findElement(By.xpath("//span[contains(text(),'Principal Place of Business')]/preceding-sibling::input")).sendKeys("123B-123C King Road, FAIRFIELD WEST NSW 2165");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='address-autocomplete__suggestions' and @aria-hidden='false']/li[1]")));
        driver.findElement(By.xpath("//ul[@class='address-autocomplete__suggestions' and @aria-hidden='false']/li[1]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Industry')]/preceding-sibling::div//input")).click();
        driver.findElement(By.xpath("//div[@id='input-size-example']//a[text()='Four-wheel drive tour operation with driver']")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Website (If Applicable)')]/preceding-sibling::input")).sendKeys("www.google.com");
        driver.findElement(By.xpath("//button[text()='save & continue']")).click();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='digit1']")));
        driver.findElement(By.xpath("//input[@id='digit1']")).sendKeys("8");
        driver.findElement(By.xpath("//input[@id='digit2']")).sendKeys("8");
        driver.findElement(By.xpath("//input[@id='digit3']")).sendKeys("8");
        driver.findElement(By.xpath("//input[@id='digit4']")).sendKeys("8");
        driver.findElement(By.xpath("//input[@id='confirmDigit1']")).sendKeys("8");
        driver.findElement(By.xpath("//input[@id='confirmDigit2']")).sendKeys("8");
        driver.findElement(By.xpath("//input[@id='confirmDigit3']")).sendKeys("8");
        driver.findElement(By.xpath("//input[@id='confirmDigit4']")).sendKeys("8");
        driver.findElement(By.xpath("//button[text()='CONTINUE']")).click();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Thrive Premium']/parent::div/following-sibling::div//button[contains(text(),'Add')]")));
        driver.findElement(By.xpath("//h3[text()='Thrive Premium']/parent::div/following-sibling::div//button[contains(text(),'Add')]")).click();
        driver.findElement(By.xpath("//button[text()='continue']")).click();
        
        driver.findElement(By.xpath("//span[contains(text(),'Card Number')]/preceding-sibling::input")).sendKeys("1111111111111111");
        driver.findElement(By.xpath("//span[contains(text(),'Card Expiry')]/preceding-sibling::input")).sendKeys("0122");
        driver.findElement(By.xpath("//span[contains(text(),'CVV')]/preceding-sibling::input")).sendKeys("123");
        driver.findElement(By.xpath("//button[text()='CONTINUE']")).click();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='continue']")));
        driver.findElement(By.xpath("//div[@class='address-drop']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[starts-with(@class,'select__menu')]/div[starts-with(@class,'select__menu-list')]/div[starts-with(@id,'react-select')and text()='123B-123C King Road, FAIRFIELD WEST NSW 2165']")).click();
        driver.findElement(By.xpath("//button[text()='continue']")).click();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'text-center homefeed')]")));
        
    }
    
    @Test(enabled=false)
    public void verifyKYCKYBForPrivateCompany() throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\config\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 60); 
        		//WebDriverWait(driver, 20);
        driver.get("https://thrive-frontend.azurewebsites.net/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-signup-btn']")));
        String title = driver.getTitle();
        Assert.assertEquals(title, "Thrive");
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='signInName']")));
        driver.findElement(By.xpath("//input[@id='signInName']")).sendKeys("hambir.nitin9@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password1!");
        WebElement loginButton = driver.findElement(By.xpath("//button[@id='continue' and text()='Login']"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].scrollIntoView(true);", loginButton);
        loginButton.click();
        //Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='heading normal-font']")));
        WebElement startVerification =  driver.findElement(By.xpath("//button[text()='Start Verification']"));
        jse.executeScript("arguments[0].scrollIntoView(true);", startVerification);
        startVerification.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Middle Name')]/preceding-sibling::input")));
        driver.findElement(By.xpath("//span[contains(text(),'Middle Name')]/preceding-sibling::input")).sendKeys("ok");
        driver.findElement(By.xpath("//span[contains(text(),'Date Of Birth')]/preceding-sibling::input")).sendKeys("01012000");
        driver.findElement(By.xpath("//span[contains(text(),'Home Address')]/preceding-sibling::input")).sendKeys("123B-123C King Road, FAIRFIELD WEST NSW 2165");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='address-autocomplete__suggestions' and @aria-hidden='false']/li[1]")));
        driver.findElement(By.xpath("//ul[@class='address-autocomplete__suggestions' and @aria-hidden='false']/li[1]")).click();
        driver.findElement(By.xpath("//button[text()='save & continue']")).click();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Your ID Verification']")));
        
        driver.findElement(By.xpath("//div[text()='Driver Licence']/parent::div/following-sibling::img")).click();
        
        driver.findElement(By.xpath("//span[contains(text(),'Driver Licence Number')]/preceding-sibling::input")).sendKeys("11111111");
        driver.findElement(By.xpath("//div[contains(text(),'State of Issue')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[starts-with(@class,'select__menu')]/div[starts-with(@class,'select__menu-list')]/div[starts-with(@id,'react-select')and text()='ACT']")).click();
        driver.findElement(By.xpath("//div[@class='verification-message']/img")).click();
        driver.findElement(By.xpath("//button[text()='Continue']")).click();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='search']")));
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("59612510237");
        driver.findElement(By.xpath("//div[@class='heading check-email']")).click();
        driver.findElement(By.xpath("//button[text()='search']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'59612510237')]/parent::span/following-sibling::div[@class='business-check-button']")));
        driver.findElement(By.xpath("//span[contains(text(),'59612510237')]/parent::span/following-sibling::div[@class='business-check-button']")).click();
        driver.findElement(By.xpath("//button[text()='Continue']")).click();
        
//        boolean gstRegistered = driver.findElement(By.xpath("//div[contains(text(),'GST Registered')]/following-sibling::div[text()='Yes']")).isSelected();
//        if(gstRegistered==false)
//        {
//        	driver.findElement(By.xpath("//div[contains(text(),'GST Registered')]/following-sibling::div[text()='Yes']")).click();
//        }
        driver.findElement(By.xpath("//span[contains(text(),'Principal Place of Business')]/preceding-sibling::input")).sendKeys("123B-123C King Road, FAIRFIELD WEST NSW 2165");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='address-autocomplete__suggestions' and @aria-hidden='false']/li[1]")));
        driver.findElement(By.xpath("//ul[@class='address-autocomplete__suggestions' and @aria-hidden='false']/li[1]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Industry')]/preceding-sibling::div//input")).click();
        //Enter industry then click
        driver.findElement(By.xpath("//div[@id='input-size-example']//a[text()='Four-wheel drive tour operation with driver']")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Website (If Applicable)')]/preceding-sibling::input")).sendKeys("www.google.com");
        driver.findElement(By.xpath("//button[text()='save & continue']")).click();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='add Beneficial Owner']")));
        driver.findElement(By.xpath("//button[text()='add Beneficial Owner']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'First Name')]/preceding-sibling::input")));
        driver.findElement(By.xpath("//span[contains(text(),'First Name')]/preceding-sibling::input")).sendKeys("Nitin");
        driver.findElement(By.xpath("//span[contains(text(),'Last Name')]/preceding-sibling::input")).sendKeys("Hambir");
        driver.findElement(By.xpath("//span[contains(text(),'Middle Name')]/preceding-sibling::input")).sendKeys("ok");
        driver.findElement(By.xpath("//span[contains(text(),'Date Of Birth')]/preceding-sibling::input")).sendKeys("01012000");
        driver.findElement(By.xpath("//span[contains(text(),'Home Address')]/preceding-sibling::input")).sendKeys("333R Napier Street, STRATHMORE VIC 3041");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='address-autocomplete__suggestions' and @aria-hidden='false']/li[1]")));
        driver.findElement(By.xpath("//ul[@class='address-autocomplete__suggestions' and @aria-hidden='false']/li[1]")).click();
        driver.findElement(By.xpath("//div[text()='Driver Licence']/parent::div/following-sibling::img")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Driver Licence Number')]/preceding-sibling::input")).sendKeys("11111111");
        driver.findElement(By.xpath("//div[contains(text(),'State of Issue')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[starts-with(@class,'select__menu')]/div[starts-with(@class,'select__menu-list')]/div[starts-with(@id,'react-select')and text()='WA']")).click();
        driver.findElement(By.xpath("//button[text()='Save Beneficial Owner']")).click();
        driver.findElement(By.xpath("//button[text()='save & continue']")).click();
        
        //Add director
        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Your Director Details']")));
        WebElement addDirectorButton = driver.findElement(By.xpath("//button[text()='Add director']"));
        jse.executeScript("arguments[0].scrollIntoView(true);", addDirectorButton);
        addDirectorButton.click();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'First Name')]/preceding-sibling::input")));
        driver.findElement(By.xpath("//span[contains(text(),'First Name')]/preceding-sibling::input")).sendKeys("Nitin");
        driver.findElement(By.xpath("//span[contains(text(),'Last Name')]/preceding-sibling::input")).sendKeys("Hambir");
        driver.findElement(By.xpath("//span[contains(text(),'Middle Name')]/preceding-sibling::input")).sendKeys("ok");
        driver.findElement(By.xpath("//span[contains(text(),'Date Of Birth')]/preceding-sibling::input")).sendKeys("01012000");
        driver.findElement(By.xpath("//span[contains(text(),'Home Address')]/preceding-sibling::input")).sendKeys("333R Napier Street, STRATHMORE VIC 3041");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='address-autocomplete__suggestions' and @aria-hidden='false']/li[1]")));
        driver.findElement(By.xpath("//ul[@class='address-autocomplete__suggestions' and @aria-hidden='false']/li[1]")).click();
        driver.findElement(By.xpath("//div[text()='Driver Licence']/parent::div/following-sibling::img")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Driver Licence Number')]/preceding-sibling::input")).sendKeys("11111111");
        driver.findElement(By.xpath("//div[contains(text(),'State of Issue')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[starts-with(@class,'select__menu')]/div[starts-with(@class,'select__menu-list')]/div[starts-with(@id,'react-select')and text()='WA']")).click();
        driver.findElement(By.xpath("//button[text()='save director']")).click();
        driver.findElement(By.xpath("//button[text()='continue']")).click();
        
        //set pin
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='digit1']")));
        driver.findElement(By.xpath("//input[@id='digit1']")).sendKeys("8");
        driver.findElement(By.xpath("//input[@id='digit2']")).sendKeys("8");
        driver.findElement(By.xpath("//input[@id='digit3']")).sendKeys("8");
        driver.findElement(By.xpath("//input[@id='digit4']")).sendKeys("8");
        driver.findElement(By.xpath("//input[@id='confirmDigit1']")).sendKeys("8");
        driver.findElement(By.xpath("//input[@id='confirmDigit2']")).sendKeys("8");
        driver.findElement(By.xpath("//input[@id='confirmDigit3']")).sendKeys("8");
        driver.findElement(By.xpath("//input[@id='confirmDigit4']")).sendKeys("8");
        driver.findElement(By.xpath("//button[text()='CONTINUE']")).click();
        
        //Select Plan
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Thrive Premium']/parent::div/following-sibling::div//button[contains(text(),'Add')]")));
        driver.findElement(By.xpath("//h3[text()='Thrive Premium']/parent::div/following-sibling::div//button[contains(text(),'Add')]")).click();
        driver.findElement(By.xpath("//button[text()='continue']")).click();
        
        //Insert Card details
        driver.findElement(By.xpath("//span[contains(text(),'Card Number')]/preceding-sibling::input")).sendKeys("1111111111111111");
        driver.findElement(By.xpath("//span[contains(text(),'Card Expiry')]/preceding-sibling::input")).sendKeys("0122");
        driver.findElement(By.xpath("//span[contains(text(),'CVV')]/preceding-sibling::input")).sendKeys("123");
        driver.findElement(By.xpath("//button[text()='CONTINUE']")).click();
        
        //Select address for card
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='continue']")));
        driver.findElement(By.xpath("//div[@class='address-drop']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[starts-with(@class,'select__menu')]/div[starts-with(@class,'select__menu-list')]/div[starts-with(@id,'react-select')and text()='123B-123C King Road, FAIRFIELD WEST NSW 2165']")).click();
        driver.findElement(By.xpath("//button[text()='continue']")).click();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'text-center homefeed')]")));
        
    }
    
    @Test(enabled=true)
    public void verifyInvoiceCreation() throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\config\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 60); 
        		//WebDriverWait(driver, 20);
        driver.get("https://thrive-frontend.azurewebsites.net/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-signup-btn']")));
        String title = driver.getTitle();
        Assert.assertEquals(title, "Thrive");
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='signInName']")));
        driver.findElement(By.xpath("//input[@id='signInName']")).sendKeys("nitin.hambir@patona.com.au");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password1!");
        WebElement loginButton = driver.findElement(By.xpath("//button[@id='continue' and text()='Login']"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].scrollIntoView(true);", loginButton);
        loginButton.click();
        
        
        Thread.sleep(20000);
        driver.findElement(By.xpath("//a[@href='/invoices']")).click();
        
        //draft fresh invoice and add client
        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()='Draft Invoice'])[2]")));
        driver.findElement(By.xpath("(//button[text()='Draft Invoice'])[2]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'Client Name')]/following-sibling::div/input")));
        driver.findElement(By.xpath("//div[text()='+']/preceding-sibling::input")).sendKeys("D:\\Thrive\\Test Data\\logo.jpg");
        driver.findElement(By.xpath("//label[contains(text(),'Client Name')]/following-sibling::div/input")).sendKeys("nitin");
        driver.findElement(By.xpath("//label[contains(text(),'Client Email')]/following-sibling::div/input")).sendKeys("nitin.hambir@gmail.com");
        driver.findElement(By.xpath("//label[contains(text(),'Address')]/following-sibling::div/input")).sendKeys("333R Napier Street, STRATHMORE VIC 3041");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='address-autocomplete__suggestions' and @aria-hidden='false']/li[1]")));
        driver.findElement(By.xpath("//ul[@class='address-autocomplete__suggestions' and @aria-hidden='false']/li[1]")).click();
        driver.findElement(By.xpath("//label[contains(text(),'Contact Name')]/following-sibling::div/input")).sendKeys("Nitin");
        driver.findElement(By.xpath("//label[contains(text(),'Contact Phone')]/following-sibling::div/input")).sendKeys("8080808080");
        driver.findElement(By.xpath("//label[contains(text(),'ABN or ACN')]/following-sibling::div/input")).sendKeys("98695542238");
        driver.findElement(By.xpath("//label[contains(text(),'Website')]/following-sibling::div/input")).sendKeys("https://www.plusthrive.com");
        driver.findElement(By.xpath("//button[text()='Add new client']")).click();
        Thread.sleep(8000);
        
        //add new item
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='invoice']")));
        driver.findElement(By.xpath("//button[text()='invoice']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='add item']")));
        driver.findElement(By.xpath("//button[text()='add item']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'Name')]/following-sibling::div/input")));
        driver.findElement(By.xpath("//div[text()='+']/preceding-sibling::input")).sendKeys("D:\\Thrive\\Test Data\\logo1.png");
        driver.findElement(By.xpath("//label[contains(text(),'Name')]/following-sibling::div/input")).sendKeys("Item_1");
        driver.findElement(By.xpath("//textarea[@placeholder='Description (Optional)']")).sendKeys("Item_1 Description");
        driver.findElement(By.xpath("//label[contains(text(),'Amount')]/following-sibling::div/input")).sendKeys("5");
        driver.findElement(By.xpath("//button[text()='Add new item']")).click();
        
        //add second item
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='add new item']")));
        driver.findElement(By.xpath("//button[text()='add new item']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'Name')]/following-sibling::div/input")));
        driver.findElement(By.xpath("//div[text()='+']/preceding-sibling::input")).sendKeys("D:\\Thrive\\Test Data\\logo1.png");
        driver.findElement(By.xpath("//label[contains(text(),'Name')]/following-sibling::div/input")).sendKeys("Item_2");
        driver.findElement(By.xpath("//textarea[@placeholder='Description (Optional)']")).sendKeys("Item_2 Description");
        driver.findElement(By.xpath("//label[contains(text(),'Amount')]/following-sibling::div/input")).sendKeys("10");
        driver.findElement(By.xpath("//button[text()='Add new item']")).click();
        
        //sending invoice
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='add new item']")));
        driver.findElement(By.xpath("//span[@class='client-name' and contains(text(),'Item_1')]/ancestor::div[@class='client-card']//span[text()='Add']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='add item']")));
        driver.findElement(By.xpath("//button[text()='add item']")).click();
        driver.findElement(By.xpath("//span[@class='client-name' and contains(text(),'Item_2')]/ancestor::div[@class='client-card']//span[text()='Add']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='add item']")));
        driver.findElement(By.xpath("//button[text()='Save & Continue']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='View Invoice PDF']")));
        driver.findElement(By.xpath("//button[text()='View Invoice PDF']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='close-modal-icon']")));
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[@class='close-modal-icon']")).click();
        driver.findElement(By.xpath("//button[text()='Save & Continue']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Send Invoice']")));
        driver.findElement(By.xpath("//button[text()='Send Invoice']")).click();
        
        
        
        
        
        
    }
}
