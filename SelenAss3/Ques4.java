package SelenAss3;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ques4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\IdeaProjects\\MavenProject\\src\\main\\resources\\chromedriver2.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.location='https://www.tothenew.com/'");
        js.executeScript("window.scrollBy(0,900);");
        Thread.sleep(3000);
        driver.close();
    }
}
