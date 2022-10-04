package mainFunctionalities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ImdbSignIn {
    WebDriver driver;

    Actions actions;

    public ImdbSignIn(WebDriver driver, Actions actions){
        this.driver = driver;
        this.actions = actions;
    }

    public void imdbSignInPageTitle(){
        String pageTitle = "IMDb Sign-In";
        String actualPageTitle = driver.getTitle();
        Assert.assertEquals(actualPageTitle, pageTitle, "IMDB Sign in page title not matching");
    }

    public void enterUsername(String userName){
        driver.findElement(By.xpath("//input[@id=\"ap_email\"]")).sendKeys(userName);
    }

    public void enterPassword(String password){
        driver.findElement(By.xpath("//input[@id=\"ap_password\"]")).sendKeys(password);
    }

    public void clickSignInButton(){
        driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]")).click();
    }

}
