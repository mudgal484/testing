package Selenium_Ass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques12 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\IdeaProjects\\MavenProject\\src\\main\\resources\\chromedriver2.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.automationtesting.in/Register.html");

        //There are no name locators while inspecting these elements, so I have used xpaths to locate them. I have attached a screenshot for the proof.

        driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Krishna");
        driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Yadav");
        driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("yadav123@gmail.com");
        Thread.sleep(5000);
        driver.close();
    }
}