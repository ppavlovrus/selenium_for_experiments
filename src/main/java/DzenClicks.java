import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DzenClicks {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","E:\\Selenium\\webdriver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //Maximize window
        driver.manage().window().maximize();

        //Launch the Site.
        driver.get("https://wh40k.lexicanum.com/wiki/Main_Page");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div[4]/div/table[1]/tbody/tr[3]/td[1]/a href")).click();

    }
}
