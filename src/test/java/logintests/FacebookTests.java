package logintests;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FacebookTests extends BaseTests{


    @Test
    public void login(){

        login.setEmail("andyrodriguez_9@hotmail.com");
        login.setPass("boostandy");
        login.clickEnterButton();
    }

    @Test(dependsOnMethods = "login")
    public void searchFriend(){
      var facebookHome = login.getFacebookHomePage();
      facebookHome.setSearchField("erlyn lebrón");
      facebookHome.clickAddFriendButton();
      facebookHome.resultados();

    }


}
