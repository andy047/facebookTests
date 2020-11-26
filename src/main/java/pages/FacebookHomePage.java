package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FacebookHomePage {
    private WebDriver driver;
    private By searchField = By.xpath("//input[@type='search']");
    private By addFriendButton = By.xpath("//div[@aria-label='Add friend']");
    //private By results = By.xpath("//div[@aria-label]");
    private By results = By.name("aria-label");
    //private WebDriverWait wait = new WebDriverWait(driver,5);

    public FacebookHomePage(WebDriver driver){
        this.driver=driver;
    }

    public void setSearchField(String text){
        driver.findElement(searchField).sendKeys(text);
        driver.findElement(searchField).sendKeys(Keys.ENTER);
    }

    public void clickAddFriendButton(){
        //wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Learn More"))));
       //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(addFriendButton).click();
    }

    public void resultados(){
       System.out.println(driver.findElement(results).getText());
    }
/*
    public boolean getResult(){
        List<WebElement> resultList = driver.findElements(results);
        resultList.get(0).getAttribute()
        for (String result:
             ) {

        }

        //return driver.findElement(result).getAttribute();
    }

    */
}
