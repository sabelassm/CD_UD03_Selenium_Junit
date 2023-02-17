import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


//https://codepaster.net/app.html#/student/alani-71231
public class FormTest {

    WebDriver driver;
    
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/home/sanclemente.local/sabela/Escritorio/CD_UD03_Selenium/driver/chromedriver");  
        driver = new ChromeDriver(); 
    }

    @Test
    public void testCombo(){

        driver.get("file:///home/sanclemente.local/sabela/Escritorio/CD_UD03_Selenium/src/index.html");
       
        WebElement checkboxPinha = driver.findElement(By.name("pinha"));
        WebElement checkboxSinPinha = driver.findElement(By.name("pinha"));

        checkboxPinha.click();
        checkboxSinPinha.click();
        assertEquals(true, checkboxPinha.isSelected());
        assertEquals(false, checkboxSinPinha.isSelected());
    }

    @Test
    public void testRadio(){
        driver.get("file:///home/sanclemente.local/sabela/Escritorio/CD_UD03_Selenium/src/index.html");

        WebElement masaFina = driver.findElement(By.cssSelector("[name='boton' value='1']"));
        masaFina.click(); 
        WebElement masaGruesa = driver.findElement(By.xpath("//input[@name='boton' and @value='2']"));
        masaGruesa.click();
    }

    @Test
    public void testComo(){
        driver.get("file:///home/sanclemente.local/sabela/Escritorio/CD_UD03_Selenium/src/index.html");

        Select menu = new Select(driver.findElement(By.name("menu")));
        menu.selectByIndex(0);
        menu.selectByValue("2");
        menu.selectByVisibleText("Tres");
        
    }
}
