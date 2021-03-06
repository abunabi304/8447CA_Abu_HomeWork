package amazon;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends HomePage {

        @Test(priority = 2)
        public void testCheckSearchBox() throws InterruptedException {
            checkSearchBox();
            String expectedText="\"Mask\"";
            String actualText=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).getText();
            Thread.sleep(3000);
            Assert.assertEquals(actualText,expectedText,"Product does not match");
        }

        @Test(priority = 1)
        public void testPageTitle() throws InterruptedException {
            String chromeDriverPath = "BrowserDriver/mac/chromedriver";
            System.setProperty("webdriver.chrome.driver", chromeDriverPath);
            String expectedText="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
            String actualText=driver.getTitle();
            Thread.sleep(3000);
            Assert.assertEquals(actualText,expectedText,"Page Title not match");
        }

    }



