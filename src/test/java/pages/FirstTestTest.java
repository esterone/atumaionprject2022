package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;


public class FirstTestTest extends InitializePage {

    @BeforeTest
    public void setUp() {
        super.setUp();
    }



    @Test(priority = 1)
    public void clickOnCetring() {
        homePage.clickOnCetring();
        WebElement e = driver.findElement(By.xpath("//span[contains(text(),'קייטרינג')]"));
        Assert.assertEquals(searchPage.clickOnCetring(), e);
    }


    @Test(priority = 2)
    public void clickMenu() {
        homePage.clickMenu();
        WebElement e = driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/nav[1]/div[1]/ul[1]/li[2]/a[1]/div[2]"));
        Assert.assertEquals(searchPage.clickMenu(), e);

    }

    @Test(priority = 3)
    public void orderNow() {
        homePage.orderNow();
        WebElement e = driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/nav[1]/div[1]/ul[1]/li[1]/a[1]"));
        Assert.assertEquals(searchPage.orderNow(), e);
    }


    @Test(priority = 4)
    public void ClickX() {
        homePage.ClickX();
        WebElement e = driver.findElement(By.xpath("//body/div[@id='pageWrap']/div[@id='siteContent']/div[@id='locator-popup']/div[1]/div[1]/div[1]/button[1]"));
        Assert.assertEquals(searchPage.ClickX(), e);

    }


    @Test(priority = 5)
    public void clickGobs() {
        homePage.clickGobs();
        WebElement e = driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/nav[1]/div[1]/ul[1]/li[5]/a[1]/div[2]"));
        Assert.assertEquals(searchPage.clickGobs(), e);
    }


    @Test(priority = 6)
    public void gobsMenger() {
        homePage.gobsMenger();
        WebElement e = driver.findElement(By.xpath("//span[contains(text(),'משרות ניהוליות')]"));
        Assert.assertEquals(searchPage.gobsMenger(), e);

    }


    @Test(priority = 7)
    public void gobsCounter30() {
        homePage.gobsCounter30();
        WebElement e = driver.findElement(By.xpath("//span[contains(text(),'עובדי דלפק')]"));
        Assert.assertEquals(searchPage.gobsCounter30(), e);

    }



    @Test(priority = 8)
    public void gobKitchen22() {
        homePage.gobKitchen22();
        WebElement e = driver.findElement(By.xpath("//span[contains(text(),'עובדי מטבח')]"));
        Assert.assertEquals(searchPage.gobKitchen22(), e);

    }

    @Test(priority = 9)
    public void gobKitchen2() {
        homePage.gobKitchen2();
        WebElement e = driver.findElement(By.xpath("//span[contains(text(),'שליחים')]"));
        Assert.assertEquals(searchPage.gobKitchen2(), e);

    }

    @Test(priority = 10)
    public void franchising() {
        homePage.franchising();
        WebElement e = driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/nav[1]/div[1]/ul[1]/li[7]/a[1]/div[2]"));
        Assert.assertEquals(searchPage.franchising(), e);

    }


    @Test(priority = 11)
    public void contactUs() {
        homePage.contactUs();
        WebElement e = driver.findElement(By.xpath("//span[contains(text(),'צור קשר')]"));
        Assert.assertEquals(searchPage.contactUs(), e);

    }


    @Test(priority = 12)
    public void banking() {
        homePage.banking();
        WebElement e = driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/nav[1]/div[1]/ul[1]/li[8]/a[1]/div[2]"));
        Assert.assertEquals(searchPage.banking(), e);

    }


    @Test(priority = 13)
    public void kosherBranch() {
        homePage.kosherBranch();
        WebElement e = driver.findElement(By.xpath("//body/div[@id='pageWrap']/div[@id='siteContent']/div[@id='branches-wrap']/section[@id='branches_list']/div[1]/main[1]/div[1]/section[1]/div[1]/ul[1]/li[1]/a[1]/span[1]"));
        Assert.assertEquals(searchPage.kosherBranch(), e);

    }


    @Test(priority = 14)
    public void blog() {
        homePage.blog();
        WebElement e = driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/nav[1]/div[1]/ul[1]/li[9]/a[1]/div[2]"));
        Assert.assertEquals(searchPage.blog(), e);

    }


    @Test(priority = 15)
    public void business() {
        homePage.business();
        WebElement e = driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/nav[1]/div[1]/ul[1]/li[4]/a[1]/div[2]"));
        Assert.assertEquals(searchPage.business(), e);

    }


    public void tearDown () throws IOException {
        // utilities.screenshot();
        super.tearDown();
    }




}