package mainFunctionalities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class SignInPage {
    static WebDriver driver;
    Actions actions;

    public SignInPage(WebDriver driver, Actions actions){
        this.driver = driver;
        this.actions = actions;
    }


    public static void verifySignInPageTitle(){
        String pageTitle = "Sign in with IMDb - IMDb";
        String actualPageTitle = driver.getTitle();
        Assert.assertEquals(actualPageTitle, pageTitle);
    }

    public void showMoreOptions() throws InterruptedException {
        driver.findElement(By.xpath("//div[@class=\"auth-options-toggle\"]")).click();
        Thread.sleep(3000);
    }

    public void signInOptions(String option) throws InterruptedException {
        switch (option){
            case "IMDB":
                driver.findElement(By.xpath("//*[@id='signin-options']/div/div[1]/a[1]")).click();
                break;

            case "Amazon":
                driver.findElement(By.xpath("//*[@id='signin-options']/div/div[1]/a[2]")).click();
                break;

            case "Google":
                driver.findElement(By.xpath("//*[@id='signin-options']/div/div[1]/a[3]")).click();
                break;

            case "Apple":
                driver.findElement(By.xpath("//*[@id='signin-options']/div/div[1]/a[4]")).click();
                break;

            case "Facebook":
                driver.findElement(By.xpath("//span[@class='auth-sprite imdb-logo retina']")).click();
                break;
        }
        Thread.sleep(3000);
    }
//    public void signInWithImdb(){
//        driver.findElement(By.xpath("//*[@id=\"signin-options\"]/div/div[1]/a[1]")).click();
//    }
//
//    public void signInWithAmazon(){
//        driver.findElement(By.xpath("//span[@class=\"auth-sprite amazon-logo  retina \"]")).click();
//    }
//
//    public void signInWithGoogle(){
//        driver.findElement(By.xpath("//span[@class=\"auth-sprite google-logo retina \"]")).click();
//    }
//
//    public void signInWithAppleId(){
//        driver.findElement(By.xpath("//span[@class=\"auth-sprite apple-logo retina \"]")).click();
//    }
//    public void signInWithFacebook(){
//        driver.findElement(By.xpath("//span[@class=\"auth-sprite imdb-logo retina \"]")).click();
//    }

    public void createNewAcco() throws InterruptedException {
        driver.findElement(By.xpath("//span[@class='auth-sprite imdb-logo retina']")).click();
        Thread.sleep(3000);
    }
}
