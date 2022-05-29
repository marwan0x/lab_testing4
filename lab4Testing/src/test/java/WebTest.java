import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;




public class WebTest {


    @Test
    void formTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");
        WebElement firstName = driver.findElement(By.cssSelector("#first-name"));
        WebElement lastName = driver.findElement(By.cssSelector("#last-name"));
        WebElement job = driver.findElement(By.cssSelector("#job-title"));
        WebElement button = driver.findElement(By.cssSelector("#radio-button-2"));

        firstName.sendKeys("Marwan");
        lastName.sendKeys("Yasser");
        job.sendKeys("Student");
        button.click();

        assertEquals(firstName.getAttribute("value"),"Marwan");
        assertEquals(lastName.getAttribute("value"),"Yasser");
        assertEquals(job.getAttribute("value"),"Student");
        assertTrue(button.isSelected());

    }

}
