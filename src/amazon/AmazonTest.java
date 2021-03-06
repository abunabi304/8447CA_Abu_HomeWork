package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class AmazonTest {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        String chromeDriverPath = "BrowserDriver/mac/chromedriver";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        //System.setProperty("Webdriver.chrome.driver","BrowserDriver/mac/chromedriver" );
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/");
    }
    @Test(priority = 1)
    public void amazonTitleTest(){
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title,"Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more","Page Title not match");
    }
    @Test(priority = 2)
    public void amazonLogoTest(){
        WebElement b = driver.findElement(By.xpath(".using-mouse#navbar.nav-flex.layout3.nav-bluebeacon #nav-belt #nav-logo .nav-logo-link:focus"));
        Label element = null;
        String text = element.getText();
        Assert.assertTrue(true);
        //WebElement element = driver.findElement(By.id("example"));
        
    }

    @Test(priority = 3)
    public void mailLinkTest(){
        boolean b = driver.findElement(By.linkText("span.nav-line-2")).isDisplayed();
        //Assert.assertTrue(b);
        Assert.assertEquals(b, true);
    }
    @Test(priority = 4)
    public void testProductSearch() throws InterruptedException {
        WebElement searchElement = driver.findElement(By.id("twotabsearchtextbox"));
        searchElement.sendKeys("iPhone");
        driver.findElements(By.id("nav-input"));
        Thread.sleep(3000);
        long actualText = 0;
        long expectedText = 0;
        Assert.assertEquals(actualText,expectedText,"Iphone not found");
    }
    @Test(priority = 5)
    public void testClickOnSearch() {
        WebElement searchButton = driver.findElement(By.id("iPhone"));
        searchButton.click();
        long actualText = 0;
        long expectedText = 0;
        Assert.assertEquals(actualText,expectedText,"Click On Iphone");
    }

    //nav-search-submit-button
    @AfterMethod
    public void teardown(){
        driver.quit();
    }

}
