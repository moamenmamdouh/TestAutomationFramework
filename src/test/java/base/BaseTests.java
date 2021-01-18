package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests {
    private WebDriver driver; //initiating a driver variable

    public void SetUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe"); //set chromedriver executable file
        driver = new ChromeDriver(); //assigning a new chromedriver object to the driver variable
        driver.get("https://the-internet.herokuapp.com/"); //navigate to a specific url
        driver.manage().window().maximize(); //maximize window size
        System.out.println(driver.getTitle()); //printing page's title
        //driver.quit(); //close driver
    }
    //main function

    public static void main(String args[]){
        BaseTests basetest = new BaseTests();
        basetest.SetUp();
    }
}

