import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class windowhandeling extends Setupgap {

    homepage home;
    @BeforeMethod
    void setuptest(){

        setupdriver("http://omayo.blogspot.com");
        home = PageFactory.initElements(driver,homepage.class);

}

@Test
    void test13() throws InterruptedException {

        home.searchcheck();
}
@Test
    void test14() throws InterruptedException {
        home.windowmove(driver);
    Assert.assertFalse(driver.getCurrentUrl().contains("basic_web_page"));


}
@Test
void test27() throws InterruptedException {
    home.navigate();
}















}
