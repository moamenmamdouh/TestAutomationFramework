package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTests {
    private WebDriver driver; //initiating a driver variable

    public void SetUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe"); //set chromedriver executable file
        driver = new ChromeDriver(); //assigning a new chromedriver object to the driver variable

        driver.get("https://the-internet.herokuapp.com/"); //navigate to a specific url
        driver.manage().window().maximize(); //maximize window size

        WebElement inputLink = driver.findElement(By.linkText("Shifting Content")); //Find element using link text.
        inputLink.click(); //Click on a web element

        WebElement example1 = driver.findElement(By.linkText("Example 1: Menu Element"));
        example1.click();

        List<WebElement> list = driver.findElements(By.xpath("//ul/li"));
        System.out.println(list.size());

        driver.quit(); //close driver
    }
    //main function

    public static void main(String[] args){
        BaseTests basetest = new BaseTests();
        basetest.SetUp();
    }
}

