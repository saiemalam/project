import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;


public class homepage extends Setupgap {

    @FindBy(xpath = "//*[@id=\"shop-by-category-php-hydrator-6dMXpZOWCDgD4ZzahLfBpJ\"]/div/div/div/div[2]/div[1]/a/div[2]/div")

    WebElement ad;
    @FindBy(xpath = "//*[@id=\"store-details-php-hydrator-9StoreDetailsComponent\"]/div/div[1]/div[1]/div/div/div/h2")

    WebElement find;
    @FindBy(xpath = "//*[@id=\"headerSearch\"]")

    WebElement search;
    @FindBy(xpath = "//*[@id=\"headerSearchButton\"]")

    WebElement button;
    @FindBy(xpath = "//*[@id=\"gh-cat\"]")

    WebElement ebaydrop;
    @FindBy(xpath = "//*[@id=\"footer\"]/div[3]/div/p[1]")

    WebElement action1;
    @FindBy (css= "#zipContainer > a > div > p:nth-child(2) > span > span")
    WebElement arrow;
    @FindBy (xpath= "//*[@id=\"zipContainer\"]/a/div/p[2]/span/span")
    WebElement enterzip;
    @FindBy (xpath = "/html/body/div[8]/div[2]/div/div/div/div[2]/form/div[3]/button")
    WebElement enterinput;
    @FindBy(xpath = "//*[@id=\"thd-capabilities-php-hydrator-1iYQXFq8PcCE3A0boiG1ex\"]/div/div/div[1]/a/div/div[1]/img")
    WebElement doubleclickcheck;
    @FindBy(xpath = "//a[@class=\"shop-by-category__category-link\"]")
    List<WebElement> catagory;
    @FindBy(xpath = "//*[@id=\"BlogSearch1_form\"]/form/table/tbody/tr/td[1]/input")
    WebElement search1;
    @FindBy(xpath = "//*[@id=\"BlogSearch1_form\"]/form/table/tbody/tr/td[2]/input")
    WebElement seachclick;
    @FindBy(xpath = "/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[2]/div/aside/div/div[17]/div[1]/p/a")
    WebElement windowhandel;
    @FindBy(xpath = "//*[@id=\"headerMyAccount\"]")
    WebElement log;
    @FindBy(xpath = "//*[@id=\"SPSOSignIn\"]/a/span")
    WebElement sign;
    @FindBy(xpath = "//*[@id=\"username\"]")
    WebElement email;
    @FindBy(xpath = "//*[@id=\"single-signin__body\"]/div/div[2]/form/button/span")
    WebElement cont;
    @FindBy(xpath = "//*[@id=\"top-deals__wrapper-3\"]/div/div/div[2]/div[1]/a/div/h3/span[1]")
    WebElement glacier;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div/div[3]/div/div/div[8]/div/div[1]/div[2]/button[2]")
    WebElement color;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div/div[3]/div/div/div[10]/div/div/div[1]/div/div[2]/a[1]/div[1]/div[1]")
    WebElement delivery;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div/div[3]/div/div/div[10]/div/div/div[2]/div/div/div[1]/div/div/button[2]")
    WebElement button1;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div/div[3]/div/div/div[10]/div/div/div[2]/div/div/div[2]/div[1]/div/div/button")
    WebElement cart;
    @FindBy(css ="[class=\"popular-categories__elements-text\"]")
    List<WebElement > populars;
    @FindBy(css="#yDmH0d > c-wiz > div > div > c-wiz > div > div > div > div.DRc6kd.bdn4dc > div.QlyBfb > button ")
    WebElement frame;
    @FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")
    WebElement googlesearch;
    @FindBy (xpath = "/html/body/div[3]/div[1]/div[4]/div/ul/li[3]/a")
    WebElement moving;
    @FindBy(xpath = "//*[@id=\"diyFlyout\"]/section/div/div/div[3]/div/ul/li[5]/a")
    WebElement patios;
    @FindBy(xpath = "/html/body/div[3]/div[1]/div[1]/div/ul/li[3]/a")
    WebElement pro;
    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div[2]/div/div/div[1]/div[4]/div/div/a/img")
    WebElement proad;
    @FindBy(css = "#footer > div:nth-child(2) > div > div > div:nth-child(3) > div > div:nth-child(1) > a > svg > g > path:nth-child(1)")
    WebElement pin;
    @FindBy(xpath = "/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[2]/div/aside/div/div[8]/div[1]/a")
    WebElement seleniumlink;







    void clickad() {
        ad.click();
    }

    String findtext() {
        return find.getText();
    }

    boolean findtext2() {
        return find.isDisplayed();
    }

    void setSearch(){
        search.click();
        search.sendKeys("ladder");
    }

void clicksearch(){
        button.click();
}
void drop1(){
        dropdown(ebaydrop,2);}
void zip() throws InterruptedException {

        arrow.click();
        Thread.sleep(5000);
        enterzip.sendKeys("19082");
        Thread.sleep(10000);
         enterinput.click();

}
boolean action(WebDriver dr){
        move(dr,action1);
       boolean a = action1.isDisplayed();
       return a;
}

String checktext(WebDriver dr){

        move(dr,action1);
        return action1.getText();
}
void click(WebDriver dr){
        doubleclick(dr,doubleclickcheck);

}
ArrayList<String> catagorylink(){
        ArrayList<String> text= new ArrayList<>();

        for(WebElement a : catagory){
            text.add(a.getText());
        }
        return text;
}

void searchcheck() throws InterruptedException {

        search1.sendKeys("QA");
        Thread.sleep(3000);
        seachclick.click();
    }

    void windowmove(WebDriver dr)  {
        windowhandel.click();

    }

    void login() throws InterruptedException {
   log.click();
    Thread.sleep(2000);
    sign.click();
    Thread.sleep(2000);
    email.sendKeys("saimalam1997@gmail.com");
    Thread.sleep(2000);
    cont.click();
    }

    void addcart(WebDriver dr) throws InterruptedException {

        glacier.click();
        Thread.sleep(3000);
        move(dr,color);
        color.click();
        Thread.sleep(2000);
        move(dr,delivery);
        delivery.click();
        Thread.sleep(2000);
        doubleclick(dr,button1);
        move(dr,cart);
        Thread.sleep(2000);
        cart.click();
    }
    ArrayList<String>links(){
        ArrayList<String>linktext=new ArrayList<>();
        for(WebElement a: populars ){
            linktext.add(a.getText());
        }
        return linktext;
    }


  void linksite(WebDriver dr){

        for(WebElement a:catagory){
            a.click();
            waitforvisibility(dr,5,a);
            driver.navigate().to("http://homedepot.com");
        }
  }

  void dropdowncheck() throws InterruptedException {
        dropdown(ebaydrop,0);

        for(int i=0; i<=35; i++){
            Thread.sleep(10);
            dropdown(ebaydrop,i);
        }
  }
   void project(WebDriver dr) throws InterruptedException {

        move(dr,moving);
        waitforvisibility(dr,3,moving);
        move(dr,patios);
        Thread.sleep(3000);
        patios.click();
    }

    void colorblock(WebDriver dr){
        search.click();
        search.sendKeys("color");
        waitforclickable(dr,3,search);
        button.click();
    }
    String forpro(WebDriver dr){

        pro.click();
        move(dr,proad);
        return proad.getText();
    }

    void pinlink(WebDriver dr) throws InterruptedException {

        move(dr,pin);
        Thread.sleep(3000);
        pin.click();
        Thread.sleep(3000);
        driver.navigate().to("https://homedepot.com");

    }
    void navigate() throws InterruptedException {
        seleniumlink.click();
        Thread.sleep(3000);
        driver.navigate().to("http://omayo.blogspot.com");
    }




}





