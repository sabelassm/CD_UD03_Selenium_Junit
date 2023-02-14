import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormTest {

    WebDriver driver;
    
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");  
        driver = new ChromeDriver(); 
        driver.get("src/index.html");
    }

    @Test
    public void testCombo(){
        driver.findElement(By.tagName("input")).getAttribute("type");
    }
}