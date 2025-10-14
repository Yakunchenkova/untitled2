import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TestYakunchenkova {
    WebDriver driver;
    JavascriptExecutor jse;
    @BeforeAll
    public  static void installWebDriver(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void openDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

   // @AfterEach
    //public void closeDriver(){
    //    if(driver != null){
    //        driver.close();
    //        driver.quit();
    //    }
   // }

    @Test
    public void registration(){
        driver.get("https://practice-automation.com/form-fields/");
        driver.findElement(By.id("name-input")).sendKeys("Инна");
        driver.findElement(By.xpath(("//*[@type = \"password\"]"))).sendKeys("123");
        driver.findElement(By.id("drink2")).click();
        driver.findElement(By.id("drink3")).click();
        //WebElement color3 = driver.findElement(By.id("color3"));
           //     color3.click(); - нужно спуститься ниже по странице.
        //jse = (JavascriptExecutor)driver;
       // jse.executeScript("document.getElementById('color3').value = 'Yellow';");
       // jse.executeScript("window.scrollBy(0,500)",");
        driver.findElement(By.id("automation")).click();
        List<WebElement> allUl = driver.findElements(By.tagName("ul"));
        int number = allUl.size();
