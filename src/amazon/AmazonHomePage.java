package amazon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonHomePage {

        WebDriver driver;
        String amazonUrl = "https://www.amazon.com";
        String productName = "Mask";
        String searchBoxLocator = "twotabsearchtextbox";
        String searchButtonLocator = "nav-search-submit-button";

        @BeforeMethod
        public void setUp() {
            String chromeDriverPath = "BrowserDriver/mac/chromedriver";
            System.setProperty("webdriver.chrome.driver", chromeDriverPath);
            WebDriver driver = new ChromeDriver();
            this.driver = driver;
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.get(amazonUrl);
        }

        public void testCheckSearchBox(){
            checkSearchBox();
            String expectedResult = "\"Mask\"";
            String actualResult = driver.findElement(By.className("a-color-state a-text-bold")).getText();
            Assert.assertEquals(actualResult, expectedResult, "Product does not match");
        }

        public void CustomerServiceNavBar () {
            driver.findElement(By.linkText("Customer Service")).click();
        }

        public void navigateToNewReleasesAppliances() throws InterruptedException {
            driver.findElement(By.linkText("New Releases")).click();
            Thread.sleep(500);
            driver.findElement(By.linkText("Appliances")).click();
            Thread.sleep(2000);
        }

        @Test()
        public void checkSearchBox() {
            // Enter product name
            driver.findElement(By.id(searchBoxLocator)).sendKeys(productName);
            // Click search button
            driver.findElement(By.id(searchButtonLocator)).click();
        }

        @AfterMethod
        public void tearDown () {
//        driver.close();
            driver.quit();
        }

    }

