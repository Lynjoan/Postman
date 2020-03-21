package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Wait;
import static java.util.concurrent.TimeUnit.SECONDS;

public class LoginTests {
    private WebDriver driver;
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https//identity.getpostman.com/login?addAccount=1");
        Thread.sleep(5000);

        //1. maximize the window
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        driver.findElement(By.id("email")).sendKeys("lyn@mailinator.com");
        driver.findElement(By.id("password")).sendKeys("secret@123");
        driver.findElement(By.id("loginbutton")).click();
    }
    public static void main(String args[]) throws InterruptedException {
        LoginTests test = new LoginTests();
        test.setUp();
    }
}
