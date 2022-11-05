package SelenAss3;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Ques3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\IdeaProjects\\MavenProject\\src\\main\\resources\\chromedriver2.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Actions action = new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.location='https://www.path2usa.com/travel-companion/'");
        js.executeScript("window.scrollBy(0,900);");
        Thread.sleep(1000);
        driver.findElement(By.id("form-field-travel_from")).sendKeys("Delhi");

//        WebDriverWait wait = new WebDriverWait(driver,10);
//
//        WebElement w = driver.findElement(By.xpath("//div[text()=\"Indira Gandhi International Airport  (DEL) Delhi\"]"));
//        wait.until(ExpectedConditions.elementToBeClickable(w));
        Thread.sleep(3000);
        action.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
        driver.findElement(By.id("form-field-travel_to")).sendKeys("Mumbai");
        Thread.sleep(3000);
        action.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();

        driver.findElement(By.xpath("//input[@id=\"form-field-travel_comp_date\"]")).click();
        driver.findElement(By.xpath("//span[@aria-label=\"November 10, 2022\"]")).click();

        WebElement w1 = driver.findElement(By.id("form-field-travel_comp_airline"));
        Select s = new Select(w1);
        s.selectByVisibleText("Air India");

        WebElement w2 = driver.findElement(By.id("form-field-travel_comp_language"));
        Select s1 = new Select(w2);
        s1.selectByVisibleText("Hindi");

        driver.findElement(By.xpath("(//button[@type=\"submit\"])[3]")).click();
        Thread.sleep(3000);
        driver.close();
    }
}
