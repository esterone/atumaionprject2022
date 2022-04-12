package pages;

import Utilities.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {


    @FindBy(xpath = "//span[contains(text(),'קייטרינג')]")
    WebElement clickOnCetring;

    @FindBy(xpath = "//header/div[1]/div[1]/div[2]/nav[1]/div[1]/ul[1]/li[2]/a[1]/div[2]")
    WebElement clickMenu;

    @FindBy(xpath = "//header/div[1]/div[1]/div[2]/nav[1]/div[1]/ul[1]/li[1]/a[1]")
    WebElement orderNow;

    @FindBy(xpath = "//body/div[@id='pageWrap']/div[@id='siteContent']/div[@id='locator-popup']/div[1]/div[1]/div[1]/button[1]")
    WebElement ClickX;


    @FindBy(xpath = "//header/div[1]/div[1]/div[2]/nav[1]/div[1]/ul[1]/li[5]/a[1]/div[2]")
    WebElement clickGobs;


    @FindBy(xpath = "//span[contains(text(),'משרות ניהוליות')]")
    WebElement gobsMenger;


    @FindBy(xpath = "//span[contains(text(),'עובדי דלפק')]")
    WebElement gobsCounter30;


    @FindBy(xpath = "//span[contains(text(),'עובדי מטבח')]")
    WebElement gobKitchen22;


    @FindBy(xpath = "//span[contains(text(),'שליחים')]")
    WebElement gobKitchen2;


    @FindBy(xpath = "//header/div[1]/div[1]/div[2]/nav[1]/div[1]/ul[1]/li[7]/a[1]/div[2]")
    WebElement franchising;


    @FindBy(xpath = "//span[contains(text(),'צור קשר')]")
    WebElement contactUs;



    @FindBy(xpath = "//header/div[1]/div[1]/div[2]/nav[1]/div[1]/ul[1]/li[8]/a[1]/div[2]")
    WebElement banking;

    @FindBy(xpath = "//body/div[@id='pageWrap']/div[@id='siteContent']/div[@id='branches-wrap']/section[@id='branches_list']/div[1]/main[1]/div[1]/section[1]/div[1]/ul[1]/li[1]/a[1]/span[1]")
    WebElement kosherBranch;


    @FindBy(xpath = "//header/div[1]/div[1]/div[2]/nav[1]/div[1]/ul[1]/li[9]/a[1]/div[2]")
    WebElement blog;


    @FindBy(xpath = "//header/div[1]/div[1]/div[2]/nav[1]/div[1]/ul[1]/li[4]/a[1]/div[2]")
    WebElement business;













    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

   /* public void searchInput(String Item) {
        searchInput.sendKeys(Item);*/

///1
    public void clickOnCetring() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickOnCetring.click();


    }

    public void clickMenu() {
        clickMenu.click();
    }

    public void orderNow() {
        orderNow.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void ClickX() {
        ClickX.click();

        ְְְְְְ}


    public void clickGobs() {
        clickGobs.click();
    }

    public void gobsMenger() {
        gobsMenger.click();
    }

    public void gobsCounter30() {
        gobsCounter30.click();
    }

    public void gobKitchen22() {
        gobKitchen22.click();
    }
    public void gobKitchen2() {
        gobKitchen2.click();

    }
    public void franchising() {
        franchising.click();
    }


    public void contactUs() {
        contactUs.click();
    }


    public void banking() {
        banking.click();
    }

    public void blog() {
        kosherBranch.click();
    }

    public void kosherBranch() {
        blog.click();
    }

    public void business() {
        business.click();
    }




}
























