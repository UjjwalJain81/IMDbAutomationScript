package mainFunctionalities;

import com.beust.jcommander.Parameter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static mainFunctionalities.SignInPage.verifySignInPageTitle;

public class ImdbAutomationScript {
    SignInPage signInPage;

    WebDriver driver;
    ImdbHomePage imdbHomePage;

    ImdbSignIn imdbSignIn;
    Actions actions;

    String driverPathChromeDriver = "/Users/ujjwal.jain/IdeaProjects/imdbAutomation/driver/chromedriver";
    String driverPathSafariDriver = "/usr/bin/safaridriver";

    public ImdbAutomationScript() {
        this.driver=new ChromeDriver();
//        this.driver=new SafariDriver();
        this.actions=new Actions(this.driver);
        this.imdbHomePage = new ImdbHomePage(driver,actions);
        this.signInPage = new SignInPage(this.driver, this.actions);
        this.imdbSignIn = new ImdbSignIn(driver, actions);
    }

//    @Parameters("browser")
//    @BeforeTest
    public void crossBrowser(String browser) throws Exception {
        if(browser.equalsIgnoreCase("Safari")){
            //Set path to safari-driver
            System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver");
            driver = new SafariDriver();
        }
        //Check if parameter pass from TestNg is correct or not i.e. CHROME
        else if (browser.equalsIgnoreCase("Chrome")) {
            //Set path to chrome-driver
            System.setProperty("webdriver.chrome.driver", "/Users/ujjwal.jain/IdeaProjects/imdbAutomation/driver/chromedriver");
            driver = new ChromeDriver();
        }

        else throw new Exception("Browser is invalid");
    }

//   @Parameters("WebsiteUrl")
//   @BeforeTest
    public void launchWebsite(String webUrl) throws InterruptedException {
        driver.get(webUrl);
        driver.manage().window().maximize();
        Thread.sleep(4000);
    }

//   @Test
    public void verifyHomePageTitle(){
        String pageTitle = "IMDb: Ratings, Reviews, and Where to Watch the Best Movies & TV Shows";
        String actualPageTitle = driver.getTitle();
        Assert.assertEquals(actualPageTitle, pageTitle);
    }

    public void runScript() throws InterruptedException{

        imdbHomePage.signIn();

        signInPage.verifySignInPageTitle();
        signInPage.showMoreOptions();
        signInPage.signInOptions("IMDB");

        imdbSignIn.imdbSignInPageTitle();
        imdbSignIn.enterUsername("jujjwal81@gmail.com");
        imdbSignIn.enterPassword("tempPassword81!");
        imdbSignIn.clickSignInButton();

        imdbHomePage.selectCategory(2);
        imdbHomePage.search("Logan");
        imdbHomePage.clickSearchButton();



    }



}
