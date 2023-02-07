import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {

 public static void main(String[] args) {
    
    System.setProperty("webdriver.chrome.driver", "driver/chromedriver");  
    WebDriver driver = new ChromeDriver(); 

    try {
        driver.get("https://es.wikipedia.org/");
        WebElement cajaBusqueda =  driver.findElement(By.id("searchInput"));
        cajaBusqueda.sendKeys("Selenium");
        System.out.println(driver.getTitle());

        Thread.sleep(3000);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

    driver.quit();
}

}