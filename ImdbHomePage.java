package mainFunctionalities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ImdbHomePage {
    WebDriver driver;
    Actions actions;

    public ImdbHomePage(WebDriver driver, Actions actions) {
        this.driver=driver;
        this.actions=actions;
    }

    public void search(String movieName){
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys(movieName);
    }

    public void selectCategory(int i){
        driver.findElement(By.xpath("//label[@aria-label='All']")).click();
        for(i =1; i <= 6; i++)
            driver.findElement(By.xpath("(//*[@id='navbar-search-category-select-contents']//ul//li)[2]")).click();
    }

    public void clickSearchButton(){
        driver.findElement(By.xpath("//button[@class='nav-search__search-submit searchform__submit']")).click();
    }


    public void signIn() throws InterruptedException {
        driver.findElement((By.xpath("//div[@class=\"nav__userMenu navbar__user sc-idOhPF kGntgQ\"]"))).click();
        Thread.sleep(3000);
    }

    public void menuButton() throws InterruptedException {
        driver.findElement(By.xpath("//label[@id='imdbHeader-navDrawerOpen--desktop']")).click();
        Thread.sleep(3000);
    }
}
