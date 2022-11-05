package SelenAss3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Ques1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\IdeaProjects\\MavenProject\\src\\main\\resources\\chromedriver2.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.automationtesting.in/Register.html");

        driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Krishna");
        driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Yadav");
        driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]")).sendKeys("abc-123");
        driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("yadav123@gmail.com");
        driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("1234567890");
        WebElement w5 = driver.findElement(By.xpath("(//input[@type=\"radio\"])[1]"));
        w5.click();

        driver.findElement(By.id("checkbox1")).click();
        // driver.findElement(By.id("h-contact-us")).click();
        driver.findElement(By.id("msdd")).click();
        List<WebElement> ls = driver.findElements(By.xpath("//li[@class=\"ng-scope\"]"));

        for (WebElement val : ls) {
            //   System.out.println("Total languages are: " + val.getText());
            if (val.getText().equalsIgnoreCase("English") || val.getText().equalsIgnoreCase("Hindi")) {
                // System.out.println(val.getText());
                val.click();
            }
        }
        //  Iterator<WebElement> i = ls.iterator();
        WebElement w = driver.findElement(By.id("Skills"));
        driver.findElement(By.xpath("//label[text()=\"Skills\"]")).click();
        //  w.click(); --> It is optional, next statement will run without this statement
        Select s = new Select(w);
        s.selectByValue("Networks");
        driver.findElement(By.xpath("//span[@role=\"combobox\"]")).click();
        Actions action = new Actions(driver);
        WebElement w1 = driver.findElement(By.xpath("//input[@type=\"search\"]"));
        w1.click();
        action.sendKeys("India").sendKeys(Keys.RETURN).build().perform();
        WebElement w2 = driver.findElement(By.id("yearbox"));
        // w2.click();
        Select s1 = new Select(w2);
        s1.selectByValue("1919");
        WebElement w3 = driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));
        Select s3 = new Select(w3);
        s3.selectByValue("February");
        WebElement w4 = driver.findElement(By.id("daybox"));
        Select s4 = new Select(w4);
        s4.selectByValue("7");
        driver.findElement(By.id("firstpassword")).sendKeys("hello");
        driver.findElement(By.id("secondpassword")).sendKeys("hello");
        driver.findElement(By.id("submitbtn")).click();

        Thread.sleep(5000);
        driver.close();
    }
}
