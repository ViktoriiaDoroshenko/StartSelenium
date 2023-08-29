import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TableTest {

    WebDriver wd;

    @BeforeMethod
    public void precondition() {
        wd = new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");

    }
    @Test
    public void testCSS(){
        String text = wd.findElement(By.cssSelector("#customers tr:nth-child(8) td:last-child")).getText();
        Assert.assertEquals(text, "Canada");
        Assert.assertTrue(text.contains("Can"));

        List<WebElement> elements = wd.findElements(By.xpath("//*[@id='customers']//tr"));
        System.out.println(elements.size());
        List<WebElement> elements1 = wd.findElements(By.cssSelector("#customers th"));
        System.out.println(elements1.size());
        wd.findElement(By.cssSelector("#customers tr:nth-child(3)"));
        wd.findElements(By.cssSelector("#customers td:last-child"));
    }

}