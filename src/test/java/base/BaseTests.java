package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.LoginPage;


public class BaseTests {

    private WebDriver driver;
    protected LoginPage login;

    @BeforeClass
    public void setUP(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        facebook();
        driver.manage().window().maximize();
        login = new LoginPage(driver);
    }

    private void facebook(){
        this.driver.get("https://www.facebook.com/");
    }

    @AfterClass
    public void tearDown(){
        this.driver.quit();
    }

}
