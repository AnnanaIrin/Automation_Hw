package costco;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class PracticeCostco {



    static WebDriver driver;
    String browserName = "chrome";
    static String url = "https://www.costco.com/";
    static String actualText;

    @BeforeTest
    public void setUpAutomation() {
        System.out.println("***************** Automation Started *******************");
    }

    @AfterTest
    public void tearDownAutomation() {

        System.out.println("***************** Automation End *******************");
    }




    @BeforeTest
    public static void setUpChromeBrowser() {
        String chromeDriverPath = "../Automation_Hw/BrowserDriver/Window/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    /**This test method will verify successful search box functionality
     *
     * @throws InterruptedException
     */

    @Test
    public static  void testSearchBoxCostco()throws InterruptedException{

        //Enter Keyword searchBox field
        driver.findElement(By.xpath("//*[@id=\"search-field\"]")).sendKeys("Cake");
        Thread.sleep(2000);

        //click on search button
        driver.findElement(By.xpath("//*[@id=\"formcatsearch\"]/div[2]/button/i")).click();
        Thread.sleep(2000);

        // Verify Successfully searchBox
        String actualText= driver.findElement(By.xpath("//*[@id=\"facet-availability-heading\"]")).getText();
        Thread.sleep(2000);
        String expectedText="Delivery Location";


        Assert.assertEquals(actualText,expectedText);
        Thread.sleep(2000);




    }

    /**This test method will verify successful Refill Prescriptions Functionality
     *
     * @throws InterruptedException
     */

    @Test
    public static  void testRefillPrescriptionsFunctionality()throws InterruptedException{

        //Click on Pharmacy app
        driver.findElement(By.xpath("//*[@id=\"Home_Ancillary_5\"]")).click();
        Thread.sleep(2000);


        //Click on Refill Prescription
        driver.findElement(By.xpath("//*[@id=\"refill-prescription-button\"]")).click();
        Thread.sleep(2000);

       //Verify Successfully Pharmacy
       String expectedText="Refill Prescriptions";
       Thread.sleep(2000);
       String actualText= driver.findElement(By.xpath("/html/body/main/div[3]/div[2]/div[3]/div/div/h1")).getText();
       Thread.sleep(2000);

       Assert.assertEquals(actualText,expectedText);
       Thread.sleep(2000);

    }

    /**This test method will verify successful Selected Services Functionality
     *
     * @throws InterruptedException
     */

    @Test
    public static  void testSelectedServicesFunction()throws InterruptedException {

        //Click on Services function
        driver.findElement(By.xpath("//*[@id=\"Home_Ancillary_6\"]")).click();
        Thread.sleep(2000);

        //Click on Home function
        driver.findElement(By.xpath("//*[@id=\"Home_Ancillary_6\"]")).click();
        Thread.sleep(2000);

        //Verify Successfully ServicesFunction
        String expectedText="Selected Services";
        Thread.sleep(2000);
        String actualText= driver.findElement(By.xpath("//*[@id=\"search-results\"]/div[1]/div[2]/div/div/div[5]/h2[1]/b")).getText();
        Thread.sleep(2000);

        Assert.assertEquals(actualText,expectedText);
        Thread.sleep(2000);



    }

    /**This test method will verify successful Shop by Category Functionality
     *
     * @throws InterruptedException
     */
    @Test
    public static  void testShopByCategory()throws InterruptedException{

        //Click on BusinessDeliveryFunction
        driver.findElement(By.xpath("//*[@id=\"Home_Ancillary_3\"]")).click();
        Thread.sleep(2000);


        //Click on Beverage
        driver.findElement(By.xpath("//*[@id=\"rwd-categories\"]/div/a[1]/div/img")).click();
        Thread.sleep(2000);


        //Verify Successfully Shop by Category
        String expectedText="Shop by Category";
        Thread.sleep(2000);

        String actualText= driver.findElement(By.xpath("//*[@id=\"search-results\"]/div[4]/div[2]/div/div[1]/div/h2")).getText();
        Thread.sleep(2000);



        Assert.assertEquals(actualText,expectedText);
        Thread.sleep(2000);




    }

    /**This test method will verify successful Optical Costco Location functionality
     *
     * @throws InterruptedException
     */

    @Test
    public static  void testOpticalCostcoLocation()throws InterruptedException{

        //Click on Optical button
        driver.findElement(By.xpath("//*[@id=\"Home_Ancillary_4\"]")).click();
        Thread.sleep(2000);


        //Click on find the Costco nearest location
        driver.findElement(By.xpath("//*[@id=\"search-results\"]/div[1]/div[2]/div/img")).click();
        Thread.sleep(2000);


        //Verify Successfully
        String expectedText="Costco locations";
        Thread.sleep(2000);
        String actualText= driver.findElement(By.xpath("//*[@id=\"search-results\"]/div[3]/div[2]/div[6]/a")).getText();
        Thread.sleep(2000);



        Assert.assertEquals(actualText,expectedText);
        Thread.sleep(2000);




    }

    /**This test method will verify successful Costco Return Policy functionality
     *
     * @throws InterruptedException
     */

    @Test
    public static  void testCostcoReturnPolicy()throws InterruptedException {

        //Click on CustomerService
        driver.findElement(By.xpath("//*[@id=\"customer-service-link\"]")).click();
        Thread.sleep(2000);


        //Click on Return and exchange
        driver.findElement(By.xpath("//*[@id=\"navbarDropdownMenuLink4\"]")).click();
        Thread.sleep(2000);


        //Click on Costco Return Policy
        driver.findElement(By.xpath("//*[@id=\"rn_Multiline_12_Content\"]/ol/li[2]/div/h3/a")).click();
        Thread.sleep(2000);


        //Verify Successfully
        String expectedText="Risk-Free 100% Satisfaction Guarantee";
        Thread.sleep(2000);
        String actualText= driver.findElement(By.xpath("//*[@id=\"skipToMain\"]/article/div/div[2]/div[1]/p[1]/span/span/strong")).getText();
        Thread.sleep(2000);



        Assert.assertEquals(actualText,expectedText);
        Thread.sleep(2000);



    }

    /**This test method will verify successful Find a WhereHouse functionality
     *
     * @throws InterruptedException
     */
    @Test
    public static  void testFindWhereHouse()throws InterruptedException {

        //Click on LocationsFunction
        driver.findElement(By.xpath("//*[@id=\"navigation-widget\"]/div/nav/div[11]/a")).click();
        Thread.sleep(2000);

        //Enter keyword in searchBox field
        driver.findElement(By.xpath("//*[@id=\"search-warehouse\"]")).sendKeys("Queens");
        Thread.sleep(2000);

        //Enter keyword in searchBox field
        driver.findElement(By.xpath("//*[@id=\"warehouse-locator-search-form\"]/div[1]/span/button")).click();
        Thread.sleep(2000);


        // Verify Successfully Find a Warehouse
        String expectedText="Find a Warehouse";
        Thread.sleep(2000);
        String actualText=driver.findElement(By.xpath("//*[@id=\"title-container\"]/h1[1]")).getText();
        Thread.sleep(2000);


        Assert.assertEquals(actualText,expectedText);
        Thread.sleep(2000);



    }

    /**This test method will verify successful New Membership functionality
     *
     * @throws InterruptedException
     */

    @Test
    public static  void testNewMembership()throws InterruptedException {

        //Click on Membership
        driver.findElement(By.xpath("//*[@id=\"Home_Ancillary_9\"]")).click();
        Thread.sleep(2000);

        //Click on Select Executive
        driver.findElement(By.xpath("//*[@id=\"rs-costco-membership-wrapper\"]/div[2]/div/div[2]/div[2]/div[1]/a")).click();
        Thread.sleep(2000);

        //Verify Successfully new membership
        String expectedText="New Membership";
        Thread.sleep(2000);
        String actualText= driver.findElement(By.xpath("//*[@id=\"primary-membership-block\"]/div/div[1]/div[2]/div/h2")).getText();


        Assert.assertEquals(actualText,expectedText);
        Thread.sleep(2000);



    }


    /**This test method will verify successful Black and WhiteVsColor functionality
     *
     * @throws InterruptedException
     */

    @Test
    public static  void testBlackAndWhiteVsColorFunctionality()throws InterruptedException {

        //Click on Photo function
        driver.findElement(By.xpath("//*[@id=\"Home_Ancillary_7\"]")).click();
        Thread.sleep(2000);

        // Click on Canvas
        driver.findElement(By.cssSelector("#ctl00_NavCanvasPrints")).click();
        Thread.sleep(2000);

        //Verify Successfully Black & White vs. Color"
        String expectedText="Black & White vs. Color";
        Thread.sleep(2000);
        String actualText= driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div/ul[2]/li[1]/h4")).getText();
        Thread.sleep(2000);


        Assert.assertEquals(actualText,expectedText);
        Thread.sleep(2000);



    }

    /**This test method will verify successful Shop by Category functionality
     *
     * @throws InterruptedException
     */

    @Test
    public static  void testShopByCategoryFunctionality()throws InterruptedException {

        //Click on Shop function
        driver.findElement(By.xpath("//*[@id=\"navigation-dropdown\"]/i")).click();
        Thread.sleep(2000);


        // Click on baby function
        driver.findElement(By.xpath("//*[@id=\"2\"]/a")).click();
        Thread.sleep(2000);

        //Verify Successfully Shop by category
        String expectedText="Shop by Category";
        Thread.sleep(2000);
        String actualText= driver.findElement(By.xpath("//*[@id=\"search-results\"]/div[8]/div[2]/div/div[1]/div/h2")).getText();


        Assert.assertEquals(actualText,expectedText);
        Thread.sleep(2000);



    }






}
