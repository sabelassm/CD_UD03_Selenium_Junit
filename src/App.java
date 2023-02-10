import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {

 public static void main(String[] args) {
    
    System.setProperty("webdriver.chrome.driver", "driver/chromedriver");  
    WebDriver driver = new ChromeDriver(); 

    try {

        Thread.sleep(3000);

        driver.get("https://es.wikipedia.org/");
        WebElement cajaBusqueda =  driver.findElement(By.id("searchInput"));
        cajaBusqueda.sendKeys("Selenium");
        System.out.println(driver.getTitle());
        driver.findElement(By.id("n-portal")).click();

        WebElement tituloPagina =  driver.findElement(By.id("firstHeading"));
        System.out.println(tituloPagina.getText());
        assertEquals("Portal:Comunidad", tituloPagina.getText());

        Thread.sleep(3000);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

    driver.quit();
}

@Test
public void test_wikiRandom(){
    
}
}