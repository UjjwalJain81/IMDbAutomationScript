package mainFunctionalities;

import mainFunctionalities.ImdbAutomationScript;

public class Main {
    public static void main(String[] args) throws Exception {
        //Driver paths
        System.setProperty("webdriver.chrome.driver", "/Users/ujjwal.jain/IdeaProjects/imdbAutomation/driver/chromedriver");



        //Base URL of testing website
          String WebUrl = "https://www.imdb.com/";

//
//        System.setProperty("webdriver.chrome.driver", driverPathChromeDriver);
//        System.setProperty("webdriver.chrome.driver", driverPathSafariDriver);

//        CrossBrowserScript crossBrowserScript = new CrossBrowserScript();
//        crossBrowserScript.setup();
        ImdbAutomationScript imdbAutomationScript=new ImdbAutomationScript();

         //imdbAutomationScript.crossBrowser("Chrome");
         imdbAutomationScript.launchWebsite(WebUrl);
         imdbAutomationScript.verifyHomePageTitle();
         imdbAutomationScript.runScript();
//        imdbAutomationScript.launchBrowser(baseUrl);
//        imdbAutomationScript.verifyHomePageTitle();
//        imdbAutomationScript.runScript();runScript
    }
}