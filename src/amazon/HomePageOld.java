package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HomePageOld {

        public static void main(String[] args) throws InterruptedException {
            String amazonUrl="https://www.amazon.com/";
            String productName="Mask";
            String searchBoxLocator="twotabsearchtextbox";
            String searchButtonLocator="nav-search-submit-button";
            // FireFoxBrowser
//        String fireFoxDriverPath = "BrowserDriver/windows/geckodriver.exe";
//        System.setProperty("webdriver.gecko.driver", fireFoxDriverPath);
//        WebDriver driver1 = new FirefoxDriver();
//        driver1.get("https://www.amazon.com/");
            // Edge
//        String edgeDriverPath = "BrowserDriver/windows/msedgedriver.exe";
//        System.setProperty("webdriver.edge.driver", edgeDriverPath);
//        WebDriver driver2 = new EdgeDriver();
//        driver2.get("https://www.amazon.com/");

            // ChromeBrowser
            //String chromeDriverPath = "BrowserDriver/windows/chromedriver.exe";
            String chromeDriverPath = "BrowserDriver/mac/chromedriver";
            System.setProperty("webdriver.chrome.driver", chromeDriverPath);
            WebDriver driver = new ChromeDriver();
            driver.get(amazonUrl);
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.findElement(By.id(searchBoxLocator)).sendKeys(productName);
            driver.findElement(By.id(searchButtonLocator)).click();

//        driver.findElement(By.className("nav-input nav-progressive-attribute")).click();
//        driver.findElement(By.cssSelector("fdfsdfsdf")).click();
//        driver.findElement(By.xpath("rerere")).click();
//        driver.findElement(By.tagName("rerere")).click();
//        driver.findElement(By.name("rerere")).click();
//        driver.findElement(By.linkText("rerere")).click();
//        driver.findElement(By.partialLinkText("rerere")).click();


            Thread.sleep(5000); // Wait purpose
            driver.close();

        }


    }


