package TestNG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;
public class FirstTestNG {

    public String baseUrl="http://demo.guru99.com/test/newtours/";
    String driverPath="C:\\Users\\xin.gu\\SpringPractices\\FirstTestNGProjekt\\Driver\\geckodriver.exe";
    public WebDriver driver;
    @Test
    public void verifyHomePageTitle(){
        System.out.println("Lauching firefox browser");
        System.setProperty("webdriver.gecko.driver",driverPath);
        driver=new FirefoxDriver();
        driver.get(baseUrl);
        String expectedTitle="Welcome: Mercury Tours";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        driver.close();

    }

}
