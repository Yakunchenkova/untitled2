import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestYakunchenkova {
    WebDriver driver;
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    @BeforeAll
    public  static void installWebDriver(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void openDriver(){
        driver = new ChromeDriver();

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
    }
}
