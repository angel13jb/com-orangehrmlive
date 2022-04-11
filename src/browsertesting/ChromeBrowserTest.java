package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {
        String baseurl="https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(baseurl);//lauch url
        driver.manage().window().maximize();//maximize window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get the title of page
        String title= driver.getTitle();
        System.out.println(title);
        //find the username field element
        WebElement userName=driver.findElement(By.name("txtUsername"));
        userName.sendKeys("Admin");
        //find the password field element
        WebElement password=driver.findElement(By.id("txtPassword"));
        password.sendKeys("admin123");
        //closing browser
        driver.close();

    }

}
