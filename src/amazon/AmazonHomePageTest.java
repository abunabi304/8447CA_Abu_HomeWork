package amazon;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

    public class AmazonHomePageTest extends AmazonHomePage {

        @Test(priority = 2)
        public void testCheckSearchBox(){
            checkSearchBox();
            String expectedText="\"Mask\"";
            String actualText=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).getText();
            Assert.assertEquals(actualText,expectedText,"Product does not match");
        }

        @Test(priority = 1)
        public void testPageTitle(){
            String expectedText="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
            String actualText=driver.getTitle();
            Assert.assertEquals(actualText,expectedText,"Page Title not match");
        }

        @Test(priority = 3)
        public void testCustomerServiceNavbar() {
            driver.findElement(By.linkText("Customer Service")).click();
            String expectedText = "Amazon.com Help: Help & Customer Service";
            String actualText = driver.getTitle();
            Assert.assertEquals(actualText, expectedText, "Customer service on navbar not functioning properly.");
        }

        @Test(priority = 4)
        public void testNewReleasesNavbar() {
            driver.findElement(By.linkText("New Releases")).click();
            String expectedText = "Amazon.com New Releases: The best-selling new & future releases on Amazon";
            String actualText = driver.getTitle();
            Assert.assertEquals(actualText, expectedText, "New releases on navbar not functioning properly.");
        }

        @Test(priority = 5)
        public void testBooksNavbar() {
            driver.findElement(By.linkText("Books")).click();
            String expectedText = "Amazon.com: Books";
            String actualText = driver.getTitle();
            Assert.assertEquals(actualText, expectedText, "Amazon books on navbar not functioning properly.");
        }

        @Test(priority = 6)
        public void testFashionNavbar() {
            driver.findElement(By.linkText("Fashion")).click();
            String expectedText = "Amazon Fashion | Clothing, Shoes & Jewelry | Amazon.com";
            String actualText = driver.getTitle();
            Assert.assertEquals(actualText, expectedText, "Amazon fashion on navbar not functioning properly.");
        }

        @Test(priority = 7)
        public void testKindleBooksNavbar() {
            driver.findElement(By.linkText("Kindle Books")).click();
            String expectedText = "Amazon.com: Kindle eBooks: Kindle Store: Nonfiction, Literature & Fiction, Foreign Languages, Business & Money & More";
            String actualText = driver.getTitle();
            Assert.assertEquals(actualText, expectedText, "Kindle Books on navbar not functioning properly.");
        }

        @Test(priority = 8)
        public void testFindAGiftNavbar() {
            driver.findElement(By.linkText("Find a Gift")).click();
            String expectedText = "Gifts for Everyone | Amazon.com Gift Finder";
            String actualText = driver.getTitle();
            Assert.assertEquals(actualText, expectedText, "Find a gift on navbar not functioning properly.");
        }

        @Test(priority = 9)
        public void testToysAndGamesNavbar() {
            driver.findElement(By.linkText("Toys & Games")).click();
            String expectedText = "Amazon.com: Toys & Games";
            String actualText = driver.getTitle();
            Assert.assertEquals(actualText, expectedText, "Toys & Games on navbar not functioning properly.");
        }

        @Test(priority = 10)
        public void testAmazonHomeNavbar() {
            driver.findElement(By.linkText("Amazon Home")).click();
            String expectedText = "Shop Amazon Home Products";
            String actualText = driver.getTitle();
            Assert.assertEquals(actualText, expectedText, "Amazon home on navbar not functioning properly.");
        }

        @Test(priority = 11)
        public void testPharmacyNavbar() throws InterruptedException {
            driver.findElement(By.linkText("Pharmacy")).click();
            Thread.sleep(1000);
            String expectedText = "Amazon.com: Pharmacy";
            String actualText = driver.getTitle();
            Assert.assertEquals(actualText, expectedText, "Pharmacy on navbar not functioning properly.");
        }

        @Test(priority = 12)
        public void testSellNavbar() {
            driver.findElement(By.linkText("Computers")).click();
            String expectedText = "Computers & Accessories | Amazon.com";
            String actualText = driver.getTitle();
            Assert.assertEquals(actualText, expectedText, "Computers on navbar not functioning properly.");
        }

        @Test(priority = 13)
        public void testMoversShakersMenuBar() throws InterruptedException {
            driver.findElement(By.linkText("All")).click();
            driver.findElement(By.linkText("Movers & Shakers")).click();
            Thread.sleep(500);
            String expectedText = "Amazon.com Movers & Shakers: The biggest gainers in Amazon sales rank over the past 24 hours";
            String actualText = driver.getTitle();
            Assert.assertEquals(actualText, expectedText, "Movers & shakers on menu bar not functioning properly.");
        }

        @Test(priority = 14)
        public void testPrimeVideoMenuBar() throws InterruptedException {
            driver.findElement(By.linkText("All")).click();
            driver.findElement(By.linkText("Prime Video")).click();
            Thread.sleep(500);
            driver.findElement(By.linkText("Prime Video")).click();
            Thread.sleep(500);
            String actualText = driver.getTitle();
            String expectedText = "Amazon.com: Prime Video: Prime Video";
            Assert.assertEquals(actualText, expectedText, "Prime video on menu bar not functioning properly.");
        }

        @Test(priority = 15)
        public void testBestSellers() throws InterruptedException {
            driver.findElement(By.linkText("Best Sellers")).click();
            Thread.sleep(500);
            String actualText = driver.getTitle();
            String expectedText = "Amazon.com Best Sellers: The most popular items on Amazon";
            Assert.assertEquals(actualText, expectedText, "Amazon best sellers on menu bar not functioning properly.");
        }

        @Test(priority = 16)
        public void testBestSellersItem() throws InterruptedException {
            driver.findElement(By.linkText("Best Sellers")).click();
            Thread.sleep(500);
            String actualText = driver.findElement(By.xpath("//*[@id=\"zg_left_col1\"]/div[1]/div[2]/div/div[2]/a/div[2]")).getText();
            System.out.println(actualText);
            String expectedText = "TeeTurtle | The Original Reversible Octopus Plushie | Patented Design | Black and Gray | Show your mood without saying a word!";
            Assert.assertEquals(actualText, expectedText, "Amazon music on menu bar not functioning properly.");
        }

        @Test(priority = 17)
        public void testBestSellersTopItemPage() throws InterruptedException {
            driver.findElement(By.linkText("Best Sellers")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"zg_left_col1\"]/div[1]/div[2]/div/div[2]/a/div[2]")).click();
            Thread.sleep(500);
            String actualText = driver.getTitle();
            String expectedText = "Reload Your Balance";
            Assert.assertEquals(actualText, expectedText, "Top item page on best sellers not functioning properly.");
        }

        @Test(priority = 18)
        public void testBestSellersTopItemPageText() throws InterruptedException {
            driver.findElement(By.linkText("Best Sellers")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"zg_left_col1\"]/div[1]/div[2]/div/div[2]/a/div[2]")).click();
            Thread.sleep(500);
            String actualText = driver.findElement(By.xpath("//*[@id=\"asv-form-container\"]/div/div/div[1]/h2[1]")).getText();
            String expectedText = "Reload Your Balance";
            Assert.assertEquals(actualText, expectedText, "Reload your balance text not displaying properly.");
        }

        @Test(priority = 19)
        public void testBestSellersSecondItem() throws InterruptedException {
            driver.findElement(By.linkText("Best Sellers")).click();
            Thread.sleep(500);
            String actualText = driver.findElement(By.xpath("//*[@id=\"zg_left_col1\"]/div[1]/div[3]/div/div[2]/a/div[2]")).getText();
            String expectedText = "Funko Pop! Marvel: Wandavision - Billy and Tommy, Spring Convention Exclusive";
            Assert.assertEquals(actualText, expectedText, "Product text not displaying properly.");
        }

        @Test(priority = 20)
        public void testBestSellersThirdItem() throws InterruptedException {
            driver.findElement(By.linkText("Best Sellers")).click();
            Thread.sleep(500);
            String actualText = driver.findElement(By.xpath("//*[@id=\"zg_left_col1\"]/div[1]/div[4]/div/div[2]/a/div[2]")).getText();
            String expectedText = "The Original EggMazing Easter Egg Decorator Kit - Includes 8 Colorful Quick Drying Non Toxic Markers";
            Assert.assertEquals(actualText, expectedText, "Product text not displaying properly.");
        }

        @Test(priority = 21)
        public void testTodaysDealsItem() throws InterruptedException {
            driver.findElement(By.linkText("Today's Deals")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"dealTitle\"]/span")).click();
            String expectedText = "Up to 36% off Proscenic Robot Vacuum Cleaners";
            String actualText = driver.getTitle();
            Assert.assertEquals(actualText, expectedText, "Product text not displaying properly.");
        }

        @Test(priority = 22)
        public void testTodaysDealsCoupons() throws InterruptedException {
            driver.findElement(By.linkText("Today's Deals")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[2]/span")).click();
            String expectedText = "Amazon Coupons @ Amazon.com";
            String actualText = driver.getTitle();
            Assert.assertEquals(actualText, expectedText, "Amazon coupon not displaying properly.");
        }

        @Test(priority = 23)
        public void testTodaysDealsRenewed() throws InterruptedException {
            driver.findElement(By.linkText("Today's Deals")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[3]")).click();
            String expectedText = "Amazon Renewed Deals @ Amazon.com";
            String actualText = driver.getTitle();
            Assert.assertEquals(actualText, expectedText, "Amazon coupon not displaying properly.");
        }

        @Test(priority = 24)
        public void testTodaysDealsOutlet() throws InterruptedException {
            driver.findElement(By.linkText("Today's Deals")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[4]")).click();
            String expectedText = "Amazon Outlet";
            String actualText = driver.getTitle();
            Assert.assertEquals(actualText, expectedText, "Amazon coupon not displaying properly.");
        }

        @Test(priority = 25)
        public void testTodaysDealsWarehouse() throws InterruptedException {
            driver.findElement(By.linkText("Today's Deals")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#nav-subnav > a:nth-child(5) > span")).click();
            String expectedText = "Amazon Warehouse | Great deals on quality used products";
            String actualText = driver.getTitle();
            Assert.assertEquals(actualText, expectedText, "Amazon coupon not displaying properly.");
        }

        @Test(priority = 26)
        public void testTodaysDealsDigitalDeals() throws InterruptedException {
            driver.findElement(By.linkText("Today's Deals")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#nav-subnav > a:nth-child(6) > span")).click();
            String expectedText = "Amazon.com: : Apps & Games";
            String actualText = driver.getTitle();
            Assert.assertEquals(actualText, expectedText, "Amazon coupon not displaying properly.");
        }

        @Test(priority = 27)
        public void testTodaysDealsWoot() throws InterruptedException {
            driver.findElement(By.linkText("Today's Deals")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector("#nav-subnav > a:nth-child(7) > span")).click();
            String expectedText = "Amazon.com: Daily Deals at Woot!";
            String actualText = driver.getTitle();
            Assert.assertEquals(actualText, expectedText, "Amazon coupon not displaying properly.");
        }

        @Test(priority = 28)
        public void testNewReleases() throws InterruptedException {
            driver.findElement(By.linkText("New Releases")).click();
            Thread.sleep(500);
            driver.findElement(By.linkText("Amazon Devices & Accessories")).click();
            String expectedText = "Amazon.com New Releases: The best-selling new & future releases on Amazon";
            String actualText = driver.getTitle();
            Assert.assertEquals(actualText, expectedText, "Amazon coupon not displaying properly.");
        }

        @Test(priority = 29)
        public void testNewReleasesDevicesAcc() throws InterruptedException {
            driver.findElement(By.linkText("New Releases")).click();
            Thread.sleep(500);
            driver.findElement(By.linkText("Amazon Devices & Accessories")).click();
            Thread.sleep(2000);
            String expectedText = "Amazon.com New Releases: The best-selling new & future releases in Amazon Devices & Accessories";
            String actualText = driver.getTitle();
            Assert.assertEquals(actualText, expectedText, "Amazon coupon not displaying properly.");
        }

        @Test(priority = 30)
        public void testNewReleasesLaunchPad() throws InterruptedException {
            driver.findElement(By.linkText("New Releases")).click();
            Thread.sleep(500);
            driver.findElement(By.linkText("Amazon Launchpad")).click();
            Thread.sleep(2000);
            String expectedText = "Amazon.com New Releases: The best-selling new & future releases in Amazon Launchpad";
            String actualText = driver.getTitle();
            Assert.assertEquals(actualText, expectedText, "Amazon coupon not displaying properly.");
        }

        @Test(priority = 31)
        public void testNewReleasesAppliances() throws InterruptedException {
            driver.findElement(By.linkText("New Releases")).click();
            Thread.sleep(500);
            driver.findElement(By.linkText("Appliances")).click();
            Thread.sleep(2000);
            String expectedText = "Amazon.com New Releases: The best-selling new & future releases in Appliances";
            String actualText = driver.getTitle();
            Assert.assertEquals(actualText, expectedText, "Amazon coupon not displaying properly.");
        }

        @Test(priority = 32)
        public void testNewReleasesAppliancesProduct2() throws InterruptedException {
            navigateToNewReleasesAppliances();
            String expectedText = "Replacement Ice Maker Filter ICE2 F2WC9I1 (2-Pack)";
            String actualText = driver.findElement(By.cssSelector("#zg-ordered-list > li:nth-child(2) > span > div > span > a > div")).getText();
            Assert.assertEquals(actualText, expectedText, "Appliances product not displaying properly.");
        }

        @Test(priority = 33)
        public void testNewReleasesAppliancesProduct3() throws InterruptedException {
            navigateToNewReleasesAppliances();
            String expectedText = "Replacement for Ice Maker Water Filter Whirlpool F2WC9I1 ICE2 for 50 Pound Ice Machines - 2-pack";
            String actualText = driver.findElement(By.cssSelector("#zg-ordered-list > li:nth-child(3) > span > div > span > a > div")).getText();
            Assert.assertEquals(actualText, expectedText, "Appliances product not displaying properly.");
        }

    }
