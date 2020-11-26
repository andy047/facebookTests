package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By mail = By.id("email");
    private By pass = By.id("pass");
    private By enterButton = By.id("u_0_b");
    private FacebookHomePage facebookHomePage;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setEmail(String mail) {
        driver.findElement(this.mail).sendKeys(mail);
    }
    public void setPass(String pass){
        driver.findElement(this.pass).sendKeys(pass);
    }

    public void clickEnterButton(){
        driver.findElement(enterButton).click();
    }

    public FacebookHomePage getFacebookHomePage(){
        return new FacebookHomePage(driver);
    }

}
