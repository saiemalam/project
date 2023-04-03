import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class droptest extends Setupgap {
   homepage home ;
    @BeforeMethod

    void setuptest1(){

        setupdriver("http://ebay.com");
        home= PageFactory.initElements(driver,homepage.class);
    }

    @AfterMethod
    void close() throws InterruptedException {

        home.closetab();
    }
    @Test
    void test7(){
      home.drop1();

    }

    @Test
    void test21() throws InterruptedException {
        home.dropdowncheck();
    }
}
