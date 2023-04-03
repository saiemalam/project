import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class testcase extends Setupgap {

    homepage home;
    @BeforeMethod
    void setuptest(){

        setupdriver("http://homedepot.com");
        home = PageFactory.initElements(driver,homepage.class);

    }

    @Test
    void test1(){

        home.clickad();
    }

    @Test
    void test2(){
        String actualtext = home.findtext();
        Assert.assertEquals(actualtext,"Your Store");
    }
@Test void test3(){
        Assert.assertTrue(home.findtext2());
}
@Test void test4(){

        home.clickad();

        String actualurl= driver.getCurrentUrl();

        Assert.assertEquals(actualurl,"https://www.homedepot.com/c/localad");
}


@Test (groups = "a")
void test5(){
        home.setSearch();}

    @Test(groups = "a")
    void  test6() throws InterruptedException {
        Thread.sleep(2000);
        home.clicksearch();

    }
@Test
void test8() throws InterruptedException {
        home.zip();
}
@Test
void test9() throws InterruptedException {
        boolean b= home.action(driver);
        Assert.assertTrue(b);
        Thread.sleep(3000);
}
@Test
void test10(){
        Assert.assertTrue(home.checktext(driver).contains("2000-2022"));

}
@Test
    void  test11(){
        home.click(driver);
        Assert.assertTrue(driver.getCurrentUrl().contains( "SF_Mobile_Shopping"));
}

@Test
    void test12(){
        int number = home.catagorylink().size();
        Assert.assertEquals(number,18);
}
@Test
    void test15() throws InterruptedException {
        home.login();
}
@Test
    void test16() throws InterruptedException {
        home.addcart(driver);
} @Test
    void test17(){
        ArrayList<String> brandtext= home.links();
        System.out.println(brandtext);

        Assert.assertTrue(brandtext.contains("Rock Salt"));
    }
    @Test
    void test18(){
        home.linksite(driver);

    }
    @Test

    void test23() throws InterruptedException {
        home.project(driver);
    }
    @Test
    void test24(){
        home.colorblock(driver);
    }

    @Test
    void test25(){

        Assert.assertFalse(home.forpro(driver).contains("I want to open a new Pro Xtra account"));

    }
    @Test
    void test26() throws InterruptedException {
        home.pinlink(driver);
    }














}
