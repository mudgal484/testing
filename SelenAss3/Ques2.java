package SelenAss3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Ques2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\IdeaProjects\\MavenProject\\src\\main\\resources\\chromedriver2.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Actions action = new Actions(driver);
        driver.navigate().to(" https://www.tothenew.com/");
        WebElement w = driver.findElement(By.xpath("(//a[@id=\"h-Services\"])[2]"));
        action.moveToElement(w).perform();
        List<WebElement> ls = driver.findElements(By.xpath("//li[@class=\"menu-item menu-expanded menu-active\"]//ul//li"));
        //System.out.println(ls.size());
       String parent = driver.getWindowHandle();

        for(WebElement val:ls) {
            action.keyDown(Keys.CONTROL);
            action.click(val).perform();
        }

        Set<String> s = driver.getWindowHandles();
        Iterator<String> i = s.iterator();
        while(i.hasNext()) {
            String child = i.next();
            if (!parent.equals(child)) {
                driver.switchTo().window(child);
                System.out.println(driver.getTitle());
                System.out.println(driver.getCurrentUrl());
                driver.close();
            }
        }

         driver.switchTo().window(parent);
         driver.close();
    }
}
