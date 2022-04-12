package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageResult extends BasePage {


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







    public SearchPageResult(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


/*    public WebElement searchInput() {
        return searchInput;
    }*/

    public WebElement clickOnCetring() {
        return clickOnCetring;

    }

    public WebElement clickMenu() {
        return clickMenu;
    }

    public WebElement orderNow() {
        return orderNow;
    }
    public WebElement ClickX() {
        return ClickX;
    }

    public WebElement clickGobs() {
        return clickGobs;
    }

    public WebElement gobsMenger() {
        return gobsMenger;
    }

    public WebElement gobsCounter30() {
        return gobsCounter30;
    }


    public WebElement gobKitchen22() {
        return gobKitchen22;
    }

    public WebElement gobKitchen2() {
        return gobKitchen2;
    }


    public WebElement franchising() {
        return franchising;
    }


    public WebElement contactUs() {
        return contactUs;
    }


    public WebElement banking() {
        return banking;
    }


    public WebElement kosherBranch() {
        return kosherBranch;
    }

    public WebElement blog() {
        return blog;
    }

    public WebElement business() {
        return business;
    }










}


