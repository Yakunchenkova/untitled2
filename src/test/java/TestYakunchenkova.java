import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
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

    /* @AfterEach
    public void {
     WebElement color3 = driver.findElement(By.id("color3")); -// scroll(By...)
                color3.click(); // нужно проскролить  страницу.
        jse = (JavascriptExecutor)driver;
        jse.executeScript("document.getElementById('color3').value = 'Yellow';");
        jse.executeScript("window.scrollBy(0,-500)",");
    }

    @AfterAll
     public static void closeDriver(){
         if(driver != null){
             driver.close();
             driver.quit();
        }
    } */

    @Test
    public void registration(){
        driver.get("https://practice-automation.com/form-fields/");
        driver.findElement(By.id("name-input")).sendKeys("Инна");
        driver.findElement(By.xpath(("//*[@type = \"password\"]"))).sendKeys("123");
        driver.findElement(By.id("drink2")).click();
        driver.findElement(By.id("drink3")).click();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0,500)");
    }
        /* ТРЕБУЕТ ДОРАБОТКИ!!!
    @Test 1
     public void colorVar(){
     driver.findElement(By.id("color3")).click();
     }
    @Test2
    public void automationVar(){

        driver.findElement(By.id("automation")).click(); // октрываем список с выбором и выбираем
        driver.findElement(By.Name("Yes")).click(); 
        Alert alert = driver switchTo().alert();
        String expected = "Yes";// Нужно сделать выбор
        String actual = "Yes";
        alert.accept(): // Закрываем окно
        Assertion.assertEquals(expected, actual)

        }
    @Test 3
    public void emailInput{
    driver.findElement(By.id("email")).sendKeys("inna@example.com"); // вводим e-mail
    }
    @Test4
    public void automationVar{

        List<WebElement> allUl = driver.findElements(By.tagName("ul"));// созадем массив из ul
        int number = allUl.size(); // получаем количество элементов в массиве
        for(WebElement oneUl : allUl){
            String [] words = (String[])request.getSession().getAttribute(":: marker");
        }
        String longestWord;
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            } // назодим самый длинное имя в массиве
        }
        driver.findElement(By.id("message")).sendKeys("{longestWord}+{number}");
        написать количество инструментов, описанных в пункте Automation tools,
и написать инструмент из списка Automation tools, содержащий наибольшее количество символов*/
    @Test 5
    public void {
        driver.findElement(By.id("submit0btn")).click();// нажимаем кнопку Submit
    }
 */
}
