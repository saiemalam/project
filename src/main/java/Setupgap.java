import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Setupgap {

    public WebDriver driver;

    public void setupdriver(String url) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();

    }

    void closetab() throws InterruptedException {

Thread.sleep(10000);
        driver.quit();
    }

    void dropdown(WebElement element, int index){

        Select select = new Select(element);

        select.selectByIndex(index);
    }

    void move (WebDriver drive, WebElement element){

        Actions action =new  Actions (drive);

        action.moveToElement(element).perform();

    }
    void doubleclick (WebDriver dr,WebElement element){
        Actions actions = new Actions(dr);
        actions.doubleClick(element).perform();
    }
    void waitforvisibility(WebDriver dr, int time, WebElement element){
        WebDriverWait wait = new WebDriverWait(dr,time);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
void waitforclickable(WebDriver dr, int time, WebElement element){
        WebDriverWait wait= new WebDriverWait(dr,time);
        wait.until(ExpectedConditions.elementToBeClickable(element));
}
   }






