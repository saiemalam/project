import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class iframetest extends Setupgap {

    homepage home;
@BeforeMethod
    void setuptest(){

        setupdriver("http://google.com");
        home = PageFactory.initElements(driver,homepage.class);

    }

    @Test
    void google19() throws InterruptedException {
    driver.switchTo().frame(0);
    Thread.sleep(4000);
    home.frame.click();

    }

    @Test
    void test20() throws InterruptedException {
Thread.sleep(5000);
    home.googlesearch.sendKeys("osama", Keys.ENTER);
    }





}

