package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By FormAuthentication = By.linkText("Form Authentication");

    public HomePage(WebDriver driver){
            this.driver = driver;
    }
    public void ClickFormAuthentication(){
        driver.findElement(FormAuthentication).click();

    }

}
